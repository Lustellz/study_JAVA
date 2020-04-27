package com.board.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomizedLoginSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse res,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		session.setAttribute("greeting", authentication.getName() + "님, 반갑습니다.");
		res.sendRedirect("/main");
	}

	public void setDefaultTargetUrl(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
