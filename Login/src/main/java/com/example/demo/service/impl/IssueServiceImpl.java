package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Issue;
import com.example.demo.model.Member;
import com.example.demo.model.Issue;
import com.example.demo.repository.IssueRepository;
import com.example.demo.service.IssueService;


@Service

public class IssueServiceImpl implements IssueService {
	
private IssueRepository issueRepository ;
    
   

	public IssueServiceImpl(IssueRepository issueRepository) {
	super();
	this.issueRepository = issueRepository;
}



	@Override
	public Issue saveissue(Issue issue) {
		return issueRepository.save(issue);
	}


	@Override
	public List<Issue> getAllissue() {
		 return issueRepository.findAll();
	}



	@Override
	public Issue getIssueById(Long id) {
		Optional<Issue> issue = issueRepository.findById(id);
        if (issue.isPresent()) {
            return issue.get();
        } else {
            throw new ResourceNotFoundException ("Issue" , "IssueId" , id);
        }
	}



//	@Override
//	public Issue updateIssue(Issue issue, Long id) {
//		Issue existingIssue = issueRepository.findById(id).orElseThrow (
//                () -> new ResourceNotFoundException ("Issue" , "IssuesId" , id));
//        
//        existingIssue.se(issue.getIssueName());
//        existingIssue.setGender(issue.getGender());
//        existingIssue.setDOB(issue.getDOB());
//        existingIssue.setPhoneNo(issue.getPhoneNo());
//        
//        
//        
//        issueRepository.save(existingIssue);
//        return existingIssue;
//		
//	}



	@Override
	public void deleteIssue(Long id) {
		issueRepository.findById(id).orElseThrow (() -> new ResourceNotFoundException ("Issue" , "Id" , id));
		issueRepository.deleteById(id);
	}



	@Override
	public Issue updateIssue(Issue issue, Long id) {
		Issue existingIssue = issueRepository.findById(id).orElseThrow (
                () -> new ResourceNotFoundException ("Member" , "MembersId" , id));
        
        existingIssue.setMembersName(issue.getMembersName());
        existingIssue.setBookTitle(issue.getBookTitle());
        existingIssue.setDate(issue.getDate());
//        existingIssue.setBookid(issue.getBookid());
//        existingIssue.setMemberid(issue.getMemberid());
//        existingIssue.setBookReturn(issue.getBookReturn());
//        existingIssue.setRenew(issue.getRenew());
//        
        
        
        
        issueRepository.save(existingIssue);
        return existingIssue;
		
	}



	@Override
	public void deleteRecord(Long id) {
		issueRepository.findById(id).orElseThrow (() -> new ResourceNotFoundException ("Record" , "Id" , id));
		issueRepository.deleteById(id);
		
	}


	@Override
	public Issue updateRenew(Issue issue, Long id) {
		
		return null;
	}



	@Override
	public Optional<Issue> findById(Long id) {
		return issueRepository.findById(id);
	}


}

