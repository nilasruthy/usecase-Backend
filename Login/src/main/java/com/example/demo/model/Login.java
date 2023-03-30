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
@Table (name = "login")
public class Login {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long Loginid;
	    
	    @Column (name = "UserName")
	    private String UserName;
	    
	    @Column (name = "Password")
	    private String Password ;
	    
	    @Column (name = "Role")
	    private String Role;
	    
//	    @Column (name = "Email")
//	    private String Email;
	    
	   
	    
	}