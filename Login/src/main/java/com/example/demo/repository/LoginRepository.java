package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Login;
import com.example.demo.model.Role;



public interface LoginRepository extends JpaRepository <Login,Long> {
	@Query(value = "SELECT * FROM login a WHERE a.user_name=?1 && a.password=?2 && a.role=?3", nativeQuery = true)
	Login findByUsername(String userName, String password, String role);
	

}
