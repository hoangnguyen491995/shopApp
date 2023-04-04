package com.example.shoppApp.service.impl;

import com.example.shoppApp.entity.Image;
import com.example.shoppApp.repository.ImageRepository;
import com.example.shoppApp.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageService implements IImageService{
    @Autowired
    private ImageRepository imageRepository ;

    @Override
    public Image addImage(Image image){
        if(image!=null){
            return imageRepository.save(image) ;
        }
        return null ;
    }

    @Override
    public Image updateImage( Image image){
//        if(image != null){
//            Image image1 = imageRepository.getReferenceById(image.getImage_Id()) ;
//            if(image1 != null){
//                image1.setImage_Name(image1.getImage_Name());
//            }
//        }
        return null ;
    }

    @Override
    public boolean deleteImage(long id){
        if(id>=1){
            Image image = imageRepository.getReferenceById(id);
            if(image != null){
                imageRepository.delete(image) ;
                return true ;
            }
        }
        return false ;
    }

    @Override
    public List<Image> getAllImage(){
        return imageRepository.findAll();
    }

}
