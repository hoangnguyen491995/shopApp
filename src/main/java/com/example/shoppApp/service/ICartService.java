package com.example.shoppApp.service;


import com.example.shoppApp.entity.Orders;
import com.example.shoppApp.entity.User;

public interface ICartService {
    Orders createOrder(User user);
}
