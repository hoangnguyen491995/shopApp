package com.example.shoppApp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Catalog_Id;

    private String Catalog_Name;

    @OneToMany(mappedBy = "catalog")
    private List<Product> products;

    private Date created_date;

    private Date updated_date;

}
