package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Staff;
import com.example.demo.model.Staff;
import com.example.demo.repository.StaffRepository;
import com.example.demo.service.StaffService;


@Service

public class StaffServiceImpl implements StaffService {
private StaffRepository staffRepository ;
    
   

	public StaffServiceImpl(StaffRepository staffRepository) {
	super();
	this.staffRepository = staffRepository;
}



	@Override
	public Staff savestaff(Staff staff) {
		return staffRepository.save(staff);
	}


	@Override
	public List<Staff> getAllstaff() {
		 return staffRepository.findAll();
	}



	@Override
	public Staff getStaffById(Long id) {
		Optional<Staff> staff = staffRepository.findById(id);
        if (staff.isPresent()) {
            return staff.get();
        } else {
            throw new ResourceNotFoundException ("Staff" , "StaffId" , id);
        }
	}



	@Override
	public Staff updateStaff(Staff staff, Long id) {
		Staff existingStaff = staffRepository.findById(id).orElseThrow (
                () -> new ResourceNotFoundException ("Staff" , "StaffsId" , id));
        
        existingStaff.setStaffName(staff.getStaffName());
        existingStaff.setGender(staff.getGender());
        existingStaff.setDOB(staff.getDOB());
        existingStaff.setPhoneNo(staff.getPhoneNo());
        
        
        
        staffRepository.save(existingStaff);
        return existingStaff;
		
	}



	@Override
	public void deleteStaff(Long id) {
		staffRepository.findById(id).orElseThrow (() -> new ResourceNotFoundException ("Staff" , "Id" , id));
		staffRepository.deleteById(id);
	}


}

