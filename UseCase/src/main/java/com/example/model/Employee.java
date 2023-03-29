package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
//	public long getId() {
//		return id;
//	}
//	
//	public void setId(long id) {
//		this.id=id;
//	}
//    
//	public String getfirstName() {
//		return firstName;
//	}
//	
//	public void setfirstName(String firstName) {
//		this.firstName=firstName;
//	}
//	
//	
//	public String getlastName() {
//		return lastName;
//	}
//	
//	public void setlastName(String lastName) {
//		this.lastName=lastName;
//	}
//	
//	public String getemail() {
//		return email;
//	}
//	
//	public void setemail(String email) {
//		this.email=email;
//	}

	
}