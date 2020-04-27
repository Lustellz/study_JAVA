package com.poc_proj.handler;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;

import com.poc_proj.event.controller.LoginController;
import com.poc_proj.event.service.IMemberService;

public class LoginSuccessHandler implements AuthenticationSuccessHandler{
	
	Logger log = LoggerFactory.getLogger(LoginController.class);
	private RequestCache reqCache = new HttpSessionRequestCache();
	private RedirectStrategy redStratgy = new DefaultRedirectStrategy();
	private String loginID;
	private String defaultURL;
	
	@Resource(name="memSer")
	private IMemberService memSer;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse res,
			Authentication auth) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String username = req.getParameter(getLoginID());
		
			System.out.println("Login Success. " +username);
			
//			memSer.upDate(username);
			memSer.getBagicDB(username);
			
			clearAuthenticationAttributes(req);
			resultRedirectStrategy(req, res, auth);
	}
	
	protected void clearAuthenticationAttributes(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if(session==null) return;
		session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
	}
	
	
	protected void resultRedirectStrategy(HttpServletRequest req, HttpServletResponse res,
			Authentication auth) throws IOException, ServletException {
		
		SavedRequest savedReq = reqCache.getRequest(req, res);
		
		if(savedReq!=null) {
			log.debug("권한이 필요한 페이지에 접근");
			System.out.println("여기 온 거 아니라고?");
			useSessionURL(req, res);
			System.out.println("대체???");
		} else {
			log.debug("직접 로그인 url로 이동했을 경우(GET)");
			System.out.println("로그인 success????");
			useDefaultURL(req, res);
			System.out.println("왜 여기?");
			}
		
	}
	
	protected void useSessionURL(HttpServletRequest req, HttpServletResponse res) throws IOException {
		SavedRequest savedRequest = reqCache.getRequest(req, res);
		String targetURL = savedRequest.getRedirectUrl();
		redStratgy.sendRedirect(req, res, targetURL);
	}
	
	protected void useDefaultURL(HttpServletRequest req, HttpServletResponse res) throws IOException {
		redStratgy.sendRedirect(req, res, defaultURL);
	}
	
	public String getLoginID() {
		return loginID;
	}
	
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getDefaultURL() {
		return defaultURL;
	}

	public void setDefaultURL(String defaultURL) {
		this.defaultURL = defaultURL;
	}

}
