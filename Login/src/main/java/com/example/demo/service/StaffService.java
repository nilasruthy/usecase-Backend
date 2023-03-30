package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Staff;
import com.example.demo.model.Staff;



public interface StaffService {
	Staff savestaff (Staff staff) ;
    List <Staff> getAllstaff();
    Staff getStaffById (Long id) ;
    Staff updateStaff (Staff staff, Long id);
    void deleteStaff (Long id);

}
