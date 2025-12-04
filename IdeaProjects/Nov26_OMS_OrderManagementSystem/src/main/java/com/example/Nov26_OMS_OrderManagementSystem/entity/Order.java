package com.example.Nov26_OMS_OrderManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @SequenceGenerator(name = "order_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
    private long orderId;

    private String customerName;
    private long orderQuantity;

    @ManyToOne
    private Product product;
}
