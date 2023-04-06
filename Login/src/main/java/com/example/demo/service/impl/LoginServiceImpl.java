package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Login;
import com.example.demo.model.Role;
import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;
import com.example.demo.service.LoginService;


@Service

public class LoginServiceImpl implements LoginService {
private LoginRepository loginRepository ;
    
   

	public LoginServiceImpl(LoginRepository loginRepository) {
	super();
	this.loginRepository = loginRepository;
}



	

	@Override
	public List<Login> getAlllogin() {
		 return loginRepository.findAll();
	}



	@Override
	public Login getLoginById(Long id) {
		Optional<Login> login = loginRepository.findById(id);
        if (login.isPresent()) {
            return login.get();
        } else {
            throw new ResourceNotFoundException ("Login" , "LoginId" , id);
        }
	}





	@Override
	public Login savePerson(Login login) {
		return loginRepository.save(login);
	}





	@Override
	public boolean authenticateUser(String userName, String password, String role) {
		Login login = loginRepository.findByUsername(userName, password, role);
		if(login==null || !login.getPassword().equals(password)) {
			return false;
		}
		return true;
	}



	
}

