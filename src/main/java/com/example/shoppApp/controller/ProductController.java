package com.example.shoppApp.controller;

import com.example.shoppApp.entity.Product;
import com.example.shoppApp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService productService ;

   @GetMapping("/list")
   public List<Product> list(){
       return productService.getAllProduct();
   }
   @GetMapping("/listById")
    public List<Product> listById(@RequestParam(name = "id") String productId){
       return productService.getProductById(Long.parseLong(productId));
   }
    @GetMapping("/listByCatalog")
    public List<Product> listByCatalog(@RequestParam(name = "catalogId") String catalogId){
       return  productService.getProductByCatalogId(Long.parseLong(catalogId)) ;
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/delete")
    public boolean deleteProduct(@RequestParam(name = "id") String id){
       return productService.deleteProduct(Long.parseLong(id)) ;
    }

    @PostMapping("/edit")
    public Product editProduct(@RequestBody Product product){
       return productService.updateProduct(product) ;
    }



}

