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
@Table (name = "member")
public class Member {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long Memberid ;
	    
	    @Column (name = "MembersName")
	    private String MembersName ;
	    
	    @Column (name = "Gender")
	    private String Gender ;
	    
	    @Column (name = "DOB")
	    private String DOB ;
	    
	    @Column (name = "PhoneNo")
	    private Long PhoneNo ;
	    
	    @Column (name = "MailId")
	    private String MailId ;
	    
	    
	    
	}