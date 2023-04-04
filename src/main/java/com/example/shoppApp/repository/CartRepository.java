package com.example.shoppApp.repository;

import com.example.shoppApp.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Orders, Long> {
}
