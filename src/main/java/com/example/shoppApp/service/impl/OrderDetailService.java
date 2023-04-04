package com.example.shoppApp.service.impl;

import com.example.shoppApp.entity.OrderDetail;
import com.example.shoppApp.repository.OrderDetailRepositoty;
import com.example.shoppApp.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService implements IOrderDetailService {

    @Autowired
    OrderDetailRepositoty orderDetailRepositoty ;

    @Override
    public List<OrderDetail> listOrderDetail(){
        return orderDetailRepositoty.findAll();
    }

}
