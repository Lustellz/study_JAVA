package com.poc_proj.event.service;

import com.poc_proj.event.model.MemberDetails;
import com.poc_proj.event.model.MemberAuthDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MemberDetailsService implements UserDetailsService {
	
	@Autowired
	private MemberAuthDAO memDAO;
	
	@Override
	public UserDetails loadUserByUsername(String ID) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		
		MemberDetails this_member = memDAO.selectMember(ID);
		System.out.println("select 결과"+memDAO.selectMember(ID));
		System.out.println(this_member);
		if(this_member==null) {
			System.out.println(ID + "is not found");
			throw new UsernameNotFoundException(ID+"is not found");
		}
		return this_member;
	}
	
}
