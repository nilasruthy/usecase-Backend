package com.example.demo.service;

import java.util.List;


import com.example.demo.model.Member;


public interface MemberService {
	    Member saveMember (Member member) ;
	    List <Member> getAllmember();
	    Member getMemberById (Long id);
	    Member updateMember (Member member, Long id);
	    void deleteMember (Long id);
}
