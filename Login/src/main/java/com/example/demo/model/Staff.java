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
@Table (name = "staff")
public class Staff {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long Staffid;
	    
//	    @Column (name = "StaffName")
//	    private String StaffName;
	    
	    @Column (name = "Gender")
	    private String Gender ;
	    
	    @Column (name = "DOB")
	    private String DOB;
	    
	    @Column (name = "mailId")
	    private String mailId;

	   @Column (name = "userName")
	    private String userName;
	    
	    @Column (name = "password")
	    private String password;
	    
	    @Column (name = "PhoneNo")
	    private Long PhoneNo ;
	    
	}