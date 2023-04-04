package com.example.shoppApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long User_Id;

    private String username;

    private String phone;

    private String email;

    private String password;

    @OneToMany()
    @JsonIgnore
    @JoinColumn(name="userId")
    private List<Orders> carts;

    @ManyToMany(cascade = { CascadeType.ALL})
    @JoinTable(
            name = "UserRole",
            joinColumns = { @JoinColumn(name = "userId") },
            inverseJoinColumns = { @JoinColumn(name = "roleId") }
    )
    Set<Role> roles = new HashSet<>();

    private Date created_date;

    private Date updated_date;


}
