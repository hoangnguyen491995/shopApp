package com.example.shoppApp.controller;

import com.example.shoppApp.entity.Catalog;
import com.example.shoppApp.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    ICatalogService catalogService ;

    @GetMapping("/list")
    public List<Catalog> list(){
        System.out.println(catalogService );
        return catalogService.getAllCatalog() ;
    }

}
