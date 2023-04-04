package com.example.shoppApp.service;

import com.example.shoppApp.entity.Image;

import java.util.List;

public interface IImageService {

    Image addImage(Image image) ;

    Image updateImage(Image image) ;

    boolean deleteImage(long Image_Id) ;

    List<Image> getAllImage() ;

}
