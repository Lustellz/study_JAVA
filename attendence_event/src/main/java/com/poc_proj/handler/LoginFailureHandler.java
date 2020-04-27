package com.poc_proj.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;

import com.poc_proj.event.controller.LoginController;

public class LoginFailureHandler implements AuthenticationFailureHandler {

	Logger log = LoggerFactory.getLogger(LoginController.class);
	private RequestCache reqCache = new HttpSessionRequestCache();
	private RedirectStrategy redStratgy = new DefaultRedirectStrategy();
	private String loginID;
	private String errormsg;
	private String defaultFailureURL;

	@Override
	public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse res,
			AuthenticationException exception) throws IOException, ServletException {
		// TODO Auto-generated method stub

		String username = req.getParameter(loginID);
		String o_errormsg = null;
		if (exception instanceof UsernameNotFoundException) {
			System.out.println("who are you?");
			req.setAttribute(loginID, username);
			req.setAttribute("result", "invalid");
			req.getRequestDispatcher(defaultFailureURL).forward(req, res);
			res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		} else if (exception instanceof BadCredentialsException) {
			errormsg = "error.BadCredentials";
			System.out.println("think more.");
			req.setAttribute(loginID, username);
			req.setAttribute(errormsg, o_errormsg);
			req.setAttribute("result", "wrong password");
			req.getRequestDispatcher(defaultFailureURL).forward(req, res);
			res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		}

	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public void setDefaultFailureURL(String defaultFailureUrl) {
		this.defaultFailureURL = defaultFailureUrl;
	}

	public RequestCache getReqCache() {
		return reqCache;
	}

	public void setReqCache(RequestCache reqCache) {
		this.reqCache = reqCache;
	}

	public RedirectStrategy getRedStratgy() {
		return redStratgy;
	}

	public void setRedStratgy(RedirectStrategy redStratgy) {
		this.redStratgy = redStratgy;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

}
