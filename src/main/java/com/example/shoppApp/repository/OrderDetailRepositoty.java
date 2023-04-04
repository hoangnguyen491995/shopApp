package com.example.shoppApp.repository;

import com.example.shoppApp.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepositoty extends JpaRepository<OrderDetail, Long> {
}
