package com.example.shoppApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDetail {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long orderDetailId;

        @ManyToOne
        @JoinColumn(name = "orderId", nullable = false)
        private Orders order;

//        @ManyToOne
//        @JoinColumn(name = "productId", nullable = false)
//        private Product products;

        private int quantity;

}
