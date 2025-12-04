package com.example.Nov26_OMS_OrderManagementSystem.repo;

import com.example.Nov26_OMS_OrderManagementSystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
