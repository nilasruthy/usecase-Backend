package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Staff;
import com.example.demo.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	  private StaffService staffService ;
	  
	    public StaffController(StaffService staffService) {
	        super();
	        this.staffService =staffService;
	    }
	    
	    // create rest api 
        @PostMapping()
	    public ResponseEntity<Staff> saveStaff(@RequestBody Staff staff) {
          return new ResponseEntity<Staff> (staffService.savestaff(staff), HttpStatus.CREATED);
	        }
	    
	    // get all api 
        @GetMapping
	    public List<Staff> getAllstaff () {
	        return staffService.getAllstaff();
	    }
	    
	    
	    // get by id 
        @GetMapping("{id}")
	    public ResponseEntity<Staff> getStaffById (@PathVariable ("id") Long id) {
	        return new ResponseEntity<Staff> (staffService.getStaffById(id), HttpStatus.OK);
	    }
	    
	    // update by id 
	    
	    @PutMapping ("{id}")
	    public ResponseEntity<Staff> updateStaffr(@PathVariable ("id") Long id , @RequestBody Staff staff) {
	        return new ResponseEntity<Staff> (staffService.updateStaff(staff, id), HttpStatus.OK);
	    }
	    
	    // delete api by id
	    
	        @DeleteMapping ("{id}")
	        public ResponseEntity<String> deleteStaff(@PathVariable ("id") Long id) {
	        	staffService.deleteStaff(id);
	            return new ResponseEntity <String> ("Docter info deleted" , HttpStatus.OK);
	        }
}
