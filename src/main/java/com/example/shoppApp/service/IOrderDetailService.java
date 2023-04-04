package com.example.shoppApp.service;

import com.example.shoppApp.entity.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderDetailService {
    List<OrderDetail> listOrderDetail() ;

}
