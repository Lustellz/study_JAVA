package com.poc_proj.event.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.poc_proj.event.model.MemberDetails;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@ModelAttribute("member")
	public MemberDetails member() {
		MemberDetails member = new MemberDetails();
		return member;
	}

	@ModelAttribute("serverTime")
	public String getServerTime(Locale locale) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		return dateFormat.format(date);
	}

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) throws ServletException, IOException {
		logger.info("Basic page. locale is {}", req.getLocale());
		return "home";
	}

	@RequestMapping(value = "/invalid")
	public ModelAndView accessDenied() throws Exception {
		ModelAndView mv = new ModelAndView("/error");
		mv.addObject("msg", "접근 권한이 없습니다.");

		return mv;
	}

}
