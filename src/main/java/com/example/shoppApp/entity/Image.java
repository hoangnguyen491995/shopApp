package com.example.shoppApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Image  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Image_Id;

    private String Image_Name;

    private String url;

//    @ManyToOne
//    @JsonBackReference
//    @JoinColumn(name = "Id", nullable = false)
//    private Product product;

    private Date created_date;

    private Date updated_date;

}
