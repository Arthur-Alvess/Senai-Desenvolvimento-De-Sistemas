package com.example.Model;

import jakarta.persistence.Column;           
import jakarta.persistence.Entity;           
import jakarta.persistence.GeneratedValue;   
import jakarta.persistence.GenerationType;   
import jakarta.persistence.Id;
import jakarta.persistence.Table;            
import lombok.Getter;                        
import lombok.NoArgsConstructor;             
import lombok.Setter; 

@Entity


@Table(name = "imagens") 
@Getter
@Setter
@NoArgsConstructor

public class ImagensModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "ImageURL", nullable = false)
    private String imageUrl;

}
