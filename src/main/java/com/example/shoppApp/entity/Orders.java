package com.example.shoppApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "userId",insertable =false , updatable = false)
    private User user;

//    @ManyToMany(mappedBy = "orders")
//    private Set<Product> users = new HashSet<>();

    @OneToMany(cascade = CascadeType.REMOVE)
    @JsonIgnore
    @JoinColumn(name = "orderId")
    private List<OrderDetail> orderDetails ;

    private Date created_date;

    private Date updated_date;
}
