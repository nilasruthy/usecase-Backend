package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Issue;
import com.example.demo.model.Issue;



public interface IssueService {
	Issue saveissue (Issue issue) ;
    List <Issue> getAllissue();
    Issue getIssueById (Long id) ;
    Issue updateIssue (Issue issue, Long id);
    void deleteIssue (Long id);
    Optional<Issue> findById(Long id);
   void deleteRecord(Long id);
 
   
   Issue updateRenew (Issue issue, Long id);
   
   
   

}
