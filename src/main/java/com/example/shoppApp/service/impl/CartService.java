package com.example.shoppApp.service.impl;


import com.example.shoppApp.entity.Orders;
import com.example.shoppApp.entity.User;
import com.example.shoppApp.repository.CartRepository;
import com.example.shoppApp.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Orders createOrder(User user) {
        Orders order = new Orders();
        order.setUser(user);
        return cartRepository.save(order);
    }
}
