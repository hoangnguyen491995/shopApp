package com.example.shoppApp.controller;

import com.example.shoppApp.entity.Image;
import com.example.shoppApp.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {

    @Autowired
    IImageService imageService ;

    @GetMapping("/list")
    public List<Image> list(){
        return imageService.getAllImage() ;
    }

}
