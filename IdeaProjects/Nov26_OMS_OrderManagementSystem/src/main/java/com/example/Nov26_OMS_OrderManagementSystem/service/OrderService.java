package com.example.Nov26_OMS_OrderManagementSystem.service;

import com.example.Nov26_OMS_OrderManagementSystem.entity.Order;
import com.example.Nov26_OMS_OrderManagementSystem.entity.Product;
import com.example.Nov26_OMS_OrderManagementSystem.repo.OrderRepository;
import com.example.Nov26_OMS_OrderManagementSystem.repo.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;

@Slf4j
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final ExecutorService executorService;

    public OrderService(OrderRepository orderRepository,
                        ProductRepository productRepository,
                        ExecutorService executorService) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.executorService = executorService;
    }

    public Order createOrder(long productId, String customerName, long productQuantity) {
        log.info("Creating Order - productId={}, customerName={}, quantity={}" ,
                productId, customerName, productQuantity);

        Product product = productRepository.findById(productId)
                .orElseThrow(()-> {
                        log.error("Product not found for id={}", productId);
                        return new RuntimeException("Product Not Found");
                        });

        Order order = new Order();
        order.setProduct(product);
        order.setCustomerName(customerName);
        order.setOrderQuantity(productQuantity);
        Order saved = orderRepository.save(order);

        return saved;
    }

    public Iterable<Order> getAllOrders() {
        log.info("Fetching All Orders");
        return orderRepository.findAll();
    }
}
