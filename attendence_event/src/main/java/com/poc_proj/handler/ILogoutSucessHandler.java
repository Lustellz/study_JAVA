package com.poc_proj.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

public class ILogoutSucessHandler implements LogoutSuccessHandler{

	@Override
	public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse res, Authentication auth)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		if(auth!=null && auth.getDetails()!=null) {
			try {
				req.getSession().invalidate();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		res.setStatus(HttpServletResponse.SC_OK);
		res.sendRedirect("/");
	}

}
