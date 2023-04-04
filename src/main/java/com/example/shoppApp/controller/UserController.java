package com.example.shoppApp.controller;

import com.example.shoppApp.entity.User;
import com.example.shoppApp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/list")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user) ;
    }

  // sủa theo id
//    @PutMapping("/update")
//    public User updateUser(@RequestBody User user){
//        return userService.updateUser(user) ;
//    }
//
    @PostMapping("/delete")
    public Boolean deleteUser(@RequestBody String id){
        return userService.deleteUser(Long.parseLong(id)) ;
    }


}
