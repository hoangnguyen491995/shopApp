package com.example.shoppApp.service.impl;

import com.example.shoppApp.entity.Role;
import com.example.shoppApp.entity.User;
import com.example.shoppApp.repository.RoleRepository;
import com.example.shoppApp.repository.UserRepository;
import com.example.shoppApp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    CartService cartService;

    @Override
    public User addUser(User user) {
        if (user != null) {
            return userRepository.save(user);
        }
        return null;
    }

//    @Override
//    public User updateUser( User user){
//         if(user != null){
//             User user1 = userRepository.getReferenceById(user.getUser_Id()) ;
//             if(user1 != null){
//                 user1.setEmail(user.getEmail());
//             }
//         }
//        return null ;
//    }

    @Override
    public boolean deleteUser(long id) {
        if (id >= 1) {
            User user = userRepository.getReferenceById(id);
            if (user != null) {
                userRepository.delete(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    // ==========login========
    @Override
    public Optional<User> findById(String id) {
        long id1 = Long.valueOf(id);
        return userRepository.findById(id1);
    }

    @Override
    public boolean checkLogin(String email, String password) {
        Optional<User> optionalUser = findById(email);
        if (optionalUser.isPresent() && optionalUser.get().getPassword().equals(password)) {
            return true;
        }
        return false;
    }

//    @Override
//    public void save(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        Set<Role> roles = new HashSet<>();
//        Role role = roleRepository.findByName("USER");
//        roles.add(role);
//        user.setRoles(roles);
//        User endUser = userRepository.save(user);
//        cartService.createOrder(endUser);
//    }

}
