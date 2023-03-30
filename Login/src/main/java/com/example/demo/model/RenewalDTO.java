package com.example.demo.model;

import java.time.LocalDate;
import java.util.Date;

public class RenewalDTO {
	
	 private LocalDate newDate;
	 
	 public RenewalDTO() {}
	public RenewalDTO(LocalDate newDate) {
		super();
		this.newDate = newDate;
	}
	public LocalDate getNewDate() {
		return newDate;
	}
	public void setNewDate(LocalDate newDate) {
		this.newDate = newDate;
	}
		
	


}
