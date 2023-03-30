package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Login;
import com.example.demo.model.Role;

public interface LoginService {
    List <Login> getAlllogin();
    Login getLoginById (Long id) ;
    Login savePerson(Login login);
	boolean authenticateUser(String userName,String password, String role );
}
