package com.example.shoppApp.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    private String nameProduct;

    private String description;

    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalogId", nullable = false)
    private Catalog catalog;

    private String url;
    private String insurance;

    private Date created_date;

    private Date updated_date;


//    @OneToMany(cascade = CascadeType.REMOVE)
//    @JsonIgnore
//    @JoinColumn(name = "productId")
//    private List<Product> products ;
}















//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "Catalog_Id", nullable = false)
//    @JsonBackReference
//    private Catalog catalog;


//    @OneToMany(mappedBy = "product")
//    @JsonManagedReference
//    @JsonIgnore
//    private List<Image> images;

//    @ManyToMany(cascade = {CascadeType.ALL})
//    @JoinTable(
//            name = "Orders_product",
//            joinColumns = {@JoinColumn(name = "order_id")},
//            inverseJoinColumns = {@JoinColumn(name = "product_id")}
//    )
//
//    Set<Orders> orders = new HashSet<>();
