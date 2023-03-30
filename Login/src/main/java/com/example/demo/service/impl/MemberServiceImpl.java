package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;


@Service

public class MemberServiceImpl implements MemberService {
private MemberRepository memberRepository ;
    
    
    public MemberServiceImpl(MemberRepository memberRepository) {
        super();
        this.memberRepository = memberRepository;
    }


	@Override
	public Member saveMember(Member member) {
		return memberRepository.save(member);
	}


	@Override
	public List<Member> getAllmember() {
		 return memberRepository.findAll();
	}


	@Override
	public Member getMemberById(Long id) {
		Optional<Member> member = memberRepository.findById(id);
        if (member.isPresent()) {
            return member.get();
        } else {
            throw new ResourceNotFoundException ("Member" , "MembersId" , id);
        }
        }


	@Override
	public Member updateMember(Member member, Long id) {
		Member existingMember = memberRepository.findById(id).orElseThrow (
                () -> new ResourceNotFoundException ("Member" , "MembersId" , id));
        
        existingMember.setMembersName(member.getMembersName());
        existingMember.setGender(member.getGender());
        existingMember.setDOB(member.getDOB());
        existingMember.setPhoneNo(member.getPhoneNo());
        existingMember.setMailId(member.getMailId());
        
        
        memberRepository.save(existingMember);
        return existingMember;
		
        }


	@Override
	public void deleteMember(Long id) {
		memberRepository.findById(id).orElseThrow (() -> new ResourceNotFoundException ("Member" , "Id" , id));
		memberRepository.deleteById(id);		
	}
    
  
}

