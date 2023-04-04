package com.example.shoppApp.controller;


import com.example.shoppApp.entity.OrderDetail;
import com.example.shoppApp.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {
    @Autowired
    private IOrderDetailService orderDetailService ;

    @GetMapping("/list")
    public List<OrderDetail> list(){
        return  orderDetailService.listOrderDetail() ;
    }
}
