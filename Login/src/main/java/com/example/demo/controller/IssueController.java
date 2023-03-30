package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RenewalDTO;
import com.example.demo.repository.IssueRepository;
import com.example.demo.model.Issue;
import com.example.demo.service.IssueService;

@RestController
@RequestMapping("/issue")
@CrossOrigin("*")
public class IssueController {
	@Autowired
	  private IssueService issueService ;
	@Autowired
	  private IssueRepository issueRepository ;
	  
	  
	    public IssueController(IssueService issueService) {
	        super();
	        this.issueService =issueService;
	    }
	    
	    // create rest api 
        @PostMapping()
	    public ResponseEntity<Issue> saveIssue(@RequestBody Issue issue) {
          return new ResponseEntity<Issue> (issueService.saveissue(issue), HttpStatus.CREATED);
	        }
	    
	    // get all api 
        @GetMapping
	    public List<Issue> getAllissue () {
	        return issueService.getAllissue();
	    }
        
        
//	    
//	    // get by id 
//        @GetMapping("{id}")
//	    public ResponseEntity<Issue> getIssueById (@PathVariable ("id") Long id) {
//	        return new ResponseEntity<Issue> (issueService.getIssueById(id), HttpStatus.OK);
//	    }
        
        
        @PatchMapping("/issues/{id}/renew")
        public ResponseEntity<Void> renewBook(@PathVariable Long id, @RequestBody RenewalDTO renewalDTO) {
            Optional<Issue> optionalIssue = issueRepository.findById(id);
            if (!optionalIssue.isPresent()) {
                return ResponseEntity.notFound().build();
            }
        Issue issue = optionalIssue.get();
            issue.setDate(renewalDTO.getNewDate());
            issue.setRenew("Yes"); // or however you want to indicate that the book has been renewed
            issueRepository.save(issue);
            return ResponseEntity.noContent().build();
        }
	    
	    // update by id 
	    
	    @PutMapping ("{id}")
	    public ResponseEntity<Issue> updateIssuer(@PathVariable ("id") Long id , @RequestBody Issue issue) {
	        return new ResponseEntity<Issue> (issueService.updateIssue(issue, id), HttpStatus.OK);
	    }
	    
	    // delete api by id
	    
	        @DeleteMapping ("{id}")
	        public ResponseEntity<String> deleteIssue(@PathVariable ("id") Long id) {
	        	issueService.deleteIssue(id);
	            return new ResponseEntity <String> ("Docter info deleted" , HttpStatus.OK);
	        }
}
