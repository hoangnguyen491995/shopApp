package com.example.shoppApp.service;

import com.example.shoppApp.entity.Product;

import java.util.List;


public interface IProductService {

   Product addProduct(Product product) ;

    Product updateProduct(Product product) ;

   boolean deleteProduct(long Product_Id) ;

    List<Product> getAllProduct() ;

  List<Product> getProductById(long productId) ;

  List<Product> getProductByCatalogId(long catalogId) ;

}
