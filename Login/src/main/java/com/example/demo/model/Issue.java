package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity 
@Table (name = "issue")
public class Issue {

		    @Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long Issueid;
//		    
//		    @Column (name = "Memberid")
//		    private Long Memberid ;
		    
		    @Column (name = "MembersName")
		    private String MembersName ;
		    
//		    @Column (name = "Bookid")
//		    private Long Bookid ;
		    
		    @Column (name = "BookTitle")
		    private String  BookTitle;
		    
//		    @Column (name = "Issue")
//		    private String Issue;
		    
//		    @Column (name = "BookReturn")
//		    private String BookReturn;
//		    
//		    @Column (name = "Renew")
//		    private String Renew;
		    
//		    @Column (name = "Category")
//		    private String Category;
//		    
		    @Column (name = "Date")
		    private LocalDate Date;
		    
		    public Issue() {
		    	
		    }

//			public Issue(Long issueid, Long memberid, String membersName, Long bookid, String bookTitle, String issue,
//					String bookReturn, String renew, String category, LocalDate date) {
//				super();
//				Issueid = issueid;
//				Memberid = memberid;
//				MembersName = membersName;
//				Bookid = bookid;
//				BookTitle = bookTitle;
//
//				BookReturn = bookReturn;
//				Renew = renew;
//				Date = date;
//			}

//			public Long getIssueid() {
//				return Issueid;
//			}
//
//			public void setIssueid(Long issueid) {
//				Issueid = issueid;
//			}
//
//			public Long getMemberid() {
//				return Memberid;
//			}
//
//			public void setMemberid(Long memberid) {
//				Memberid = memberid;
//			}
//
//			public String getMembersName() {
//				return MembersName;
//			}
//
//			public void setMembersName(String membersName) {
//				MembersName = membersName;
//			}
//
//			public Long getBookid() {
//				return Bookid;
//			}
//
//			public void setBookid(Long bookid) {
//				Bookid = bookid;
//			}
//
//			public String getBookTitle() {
//				return BookTitle;
//			}
//
//			public void setBookTitle(String bookTitle) {
//				BookTitle = bookTitle;
//			}

//			public String getIssue() {
//				return Issue;
//			}
//
//			public void setIssue(String issue) {
//				Issue = issue;
//			}

//			public String getBookReturn() {
//				return BookReturn;
//			}
//
//			public void setBookReturn(String bookReturn) {
//				BookReturn = bookReturn;
//			}
//
//			public String getRenew() {
//				return Renew;
//			}
//
//			public void setRenew(String renew) {
//				Renew = renew;
//			}
//
//			public String getCategory() {
//				return Category;
//			}

//			public void setCategory(String category) {
//				Category = category;
//			}

//			public LocalDate getDate() {
//				return Date;
//			}
//
//			public void setDate(LocalDate date) {
//				this.Date = LocalDate.now();
//			}
//		    
		    
	    
}
