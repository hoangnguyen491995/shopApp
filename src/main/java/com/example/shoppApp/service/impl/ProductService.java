package com.example.shoppApp.service.impl;

import com.example.shoppApp.entity.Product;
import com.example.shoppApp.repository.ProductRepository;
import com.example.shoppApp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        if (product != null) {
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        if (product != null) {
            Product product1 = productRepository.findById(product.getProductId()).orElse(null);
            if (product1 != null) {
                product1.setNameProduct(product.getNameProduct());
                product1.setDescription(product.getDescription());
                product1.setPrice(product.getPrice());
                product1.setInsurance(product.getInsurance());
                return productRepository.save(product1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteProduct(long id) {
        if (id >= 1) {
            Product product = productRepository.getReferenceById(id);
            if (product != null) {
                productRepository.delete(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductById(long productId) {
        return productRepository.findAllById(Collections.singleton(productId));
    }

    @Override
    public List<Product> getProductByCatalogId(long catalogId) {
        List<Product> productList = productRepository.findAll();
        List<Product> listProductByCatalog = new ArrayList<>();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCatalog().getCatalog_Id() == catalogId) {
                listProductByCatalog.add(productList.get(i));
            }
        }
        return listProductByCatalog;
    }

}
