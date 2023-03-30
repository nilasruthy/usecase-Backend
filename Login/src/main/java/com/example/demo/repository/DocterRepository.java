package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Docter;

public interface DocterRepository extends JpaRepository <Docter , Long> {

}