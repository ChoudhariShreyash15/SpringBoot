package com.example.ProcessData.service;

import com.example.ProcessData.entity.Employees;
import com.example.ProcessData.repository.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProcessingScheduler {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessingScheduler.class);

    @Autowired
    private EmployeeRepo employeeRepo;

    @Scheduled(fixedDelay = 1000)
    public void processPendingAndFailed() {
        List<Employees> toProcess = employeeRepo.findAllByStatusNotCompleted();
        if (toProcess == null || toProcess.isEmpty()) {
            LOGGER.debug("No pending/failed entries to process");
            return;
        }

        LOGGER.info("Processing {} entries (status != COMPLETED)", toProcess.size());

        for (Employees emp : toProcess) {
            try {
                processSingle(emp);
            }
            catch (IllegalArgumentException ex) {
                LOGGER.error("Error processing employee id={}: {}", emp.getId(), ex.getMessage(), ex);
                try {
                    emp.setStatus("Illegal arg");
                    employeeRepo.save(emp);
                } catch (Exception saveEx) {
                    LOGGER.error("Failed to update status to FAILED for id={}: {}", emp.getId(), saveEx.getMessage(), saveEx);
                }
            }
            catch (Exception ex) {
                LOGGER.error("Error processing employee id={}: {}", emp.getId(), ex.getMessage(), ex);
                try {
                    emp.setStatus("FAILED");
                    employeeRepo.save(emp);
                } catch (Exception saveEx) {
                    LOGGER.error("Failed to update status to FAILED for id={}: {}", emp.getId(), saveEx.getMessage(), saveEx);
                }
            }
        }
    }

    @Transactional
    protected void processSingle(Employees emp) {
        LOGGER.info("Processing employee id={} name={} status={}", emp.getId(), emp.getName(), emp.getStatus());

        try {
            emp.setStatus("COMPLETED");
            employeeRepo.save(emp);
            LOGGER.info("Employee id={} marked COMPLETED", emp.getId());
        }

        catch (NumberFormatException ne) {
            throw ne;
        }
        catch (IllegalArgumentException e) {
            throw e;
        }
        catch (Exception e) {
            throw e;
        }
    }
}

