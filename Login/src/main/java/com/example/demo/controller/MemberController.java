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

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;


@RestController
@RequestMapping ("/member")
@CrossOrigin("*")
public class MemberController {
	  private MemberService memberService ;
	  
	
	    
	    // create rest api 
	    
	    public MemberController(MemberService memberService) {
			super();
			this.memberService = memberService;
		}

		@PostMapping ()
	    public ResponseEntity<Member> saveMember(@RequestBody Member member) {
	        
	        return new ResponseEntity<Member> (memberService.saveMember(member), HttpStatus.CREATED);
	        
	    }
	    
	    // get all api 
	    
	    @GetMapping
	    public List<Member> getAllmember () {
	        return memberService.getAllmember();
	    }
	    
	    // get by id 
	    
	    @GetMapping ("{id}")
	    public ResponseEntity<Member> getMemberById (@PathVariable ("id") Long id) {
	        return new ResponseEntity<Member> (memberService.getMemberById(id), HttpStatus.OK);
	    }
	    
	    // update by id 
	    
	    @PutMapping ("{id}")
	    public ResponseEntity<Member> updateMember(@PathVariable ("id") Long id , @RequestBody Member member) {
	        return new ResponseEntity<Member> (memberService.updateMember(member, id), HttpStatus.OK);
	    }
	    
	    // delete api by id
	    
	        @DeleteMapping ("{id}")
	        public ResponseEntity<String> deleteMember(@PathVariable ("id") Long id) {
	        	memberService.deleteMember(id);
	            return new ResponseEntity <String> ("Docter info deleted" , HttpStatus.OK);
	        }
}
