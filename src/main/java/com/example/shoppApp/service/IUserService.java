package com.example.shoppApp.service;
import com.example.shoppApp.entity.User;

import java.util.List;
import java.util.Optional;


public interface IUserService {

     User addUser(User user) ;

//     User updateUser(User user) ;

     boolean deleteUser(long User_Id) ;

     List<User> getAllUser() ;


//     ======login=======

   boolean checkLogin(String email, String password);

     Optional<User> findById(String id);

//    void save(User user);

}
