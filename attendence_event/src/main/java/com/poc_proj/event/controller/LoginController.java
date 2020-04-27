package com.poc_proj.event.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.poc_proj.event.model.MemberDetails;

/**
 * Handles requests for the application home page.
 */
@Controller

public class LoginController {

	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {
		logger.info("contextpath is: {}", request.getContextPath());
		return request.getContextPath();
	}

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@ModelAttribute("serverTime")
	public String getServerTime(Locale locale) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		logger.info("Date is: {}", date);
		return dateFormat.format(date);
	}

	@RequestMapping("/loginForm")

	public String loginForm() throws Exception {
		logger.info("To loginForm");

		return "/login/loginForm";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String memLogout(MemberDetails mem, HttpServletRequest request) {
		if (request.getMethod().equals("GET")) {
			// alert 표시
			logger.info("invalid access");
			System.out.println("invalid access");

			return "home";
		}

		request.getAttribute("ID");

		return "/login/loginForm";
	}

}
