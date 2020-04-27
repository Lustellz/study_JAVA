package com.poc_proj.provider;

import java.util.Collection;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.poc_proj.event.model.MemberDetails;
import com.poc_proj.event.service.MemberDetailsService;
import com.poc_proj.event.service.MemberService;

public class MemberAuthProvider implements AuthenticationProvider {

	@Resource(name = "memSer")
	private MemberService memSer;
	@Autowired
	private MemberDetailsService memberDetailsService;

	Logger log = LoggerFactory.getLogger(MemberDetails.class);

	@SuppressWarnings({ "unchecked", "null" })
	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		// TODO Auto-generated method stub
		
			String ID = auth.getPrincipal()==null? "NONE_PROVIDED":auth.getName();	
			String password = (String) auth.getCredentials();
			
			UserDetails this_mem = memberDetailsService.loadUserByUsername(ID);
			
			try {
				System.out.println("여기는 왔겠지??? authprovider "+this_mem);

				if(null==this_mem) {
					System.out.println("누구세요?");
					throw new UsernameNotFoundException(this_mem.getUsername()+" is not found");
				} 
				
				else if(!matchPassword(password, this_mem.getPassword())) {
					System.out.println("password wrong");
					throw new BadCredentialsException(ID);
				}
				System.out.println("login succeed");
				Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) this_mem.getAuthorities();
				
				return new UsernamePasswordAuthenticationToken(ID, password, authorities);
			
		}catch(Exception e) {
			throw new UsernameNotFoundException(e.getMessage()+"is not found");
		}
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

	private boolean matchPassword(String loginPw, String password) {
		return loginPw.contentEquals(password);
	}
}
