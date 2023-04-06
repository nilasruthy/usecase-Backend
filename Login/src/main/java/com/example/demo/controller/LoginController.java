package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.model.Role;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin("*")
public class LoginController {
	  private LoginService loginService ;
	  
	    public LoginController(LoginService loginService) {
	        super();
	        this.loginService =loginService;
	    }
	    
	  
	    
	    // get all api 
        @GetMapping
	    public List<Login> getAlllogin () {
	        return loginService.getAlllogin();
	    }
	    
	    
	    // get by id 
        @GetMapping("{id}")
	    public ResponseEntity<Login> getLoginById (@PathVariable ("id") Long id) {
	        return new ResponseEntity<Login> (loginService.getLoginById(id), HttpStatus.OK);
	    }
        
        
        @PostMapping
        public ResponseEntity<Login> savePerson(@RequestBody Login login){
            return new ResponseEntity<Login>(loginService.savePerson(login), HttpStatus.CREATED);
        }
        
        @PostMapping("/add")
        public ResponseEntity<String> login(@RequestBody Login login){
            String userName = login.getUserName();
            String password = login.getPassword();
            String role = login.getRole();
            
            boolean isAuthenticated = loginService.authenticateUser(userName, password, role);
            
            if(isAuthenticated) {
                return ResponseEntity.ok("User authenticated successfully");
            }else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
            }
        }
   
}
