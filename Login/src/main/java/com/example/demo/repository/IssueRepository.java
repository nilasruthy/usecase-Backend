package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Issue;


public interface IssueRepository extends JpaRepository <Issue,Long>{
	Optional<Issue> findById(Long id);
}
