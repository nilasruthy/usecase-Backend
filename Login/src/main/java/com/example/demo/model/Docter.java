package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity 
@Table (name = "docter")
public class Docter {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id ;
    
    @Column (name = "name" , nullable = false)
    private String name ;
    
    @Column (name = "specialist")
    private String specialist ;
    
    @Column (name = "email")
    private String email ;
    
    @Column (name = "number")
    private Long number ;
    
    @Column (name = "password")
    private String password ;
}