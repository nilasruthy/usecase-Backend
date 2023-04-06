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
@Table (name = "book")
public class Book {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long Bookid;
	    
	    @Column (name = "BookTitle")
	    private String  BookTitle;
	    
	    @Column (name = "Author")
	    private String Author;
	    
	    @Column (name = "Category")
	    private String Category;
	    
	    @Column (name = "Keyword")
	    private String Keyword;
	    
	  

//		public Member(Long membersid, String membersName, String gender, String dOB, Long phoneNo, String mailId,
//				String memberUserName, String membersPasswrd) {
//			super();
//			id = membersid;
//			MembersName = membersName;
//			Gender = gender;
//			DOB = dOB;
//			PhoneNo = phoneNo;
//			MailId = mailId;
//			this.memberUserName = memberUserName;
//			this.membersPasswrd = membersPasswrd;
//		}
	    
	    
	    
	}