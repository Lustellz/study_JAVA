package com.poc_proj.event.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.poc_proj.event.model.MemberAuthDAO;
import com.poc_proj.event.model.MemberDetails;
import com.poc_proj.event.service.IMemberService;

@Controller

public class AttendController {
	private static final Logger logger = LoggerFactory.getLogger(AttendController.class);
	@Autowired
	private MemberAuthDAO memDAO;

	@ModelAttribute("member")
	public MemberDetails this_mem(String memID) {
		MemberDetails member = new MemberDetails();
		member = memDAO.selectMember(memID);
		return member;
	}
	
	@ModelAttribute("serverTime")
	public String getServerTime(Locale locale) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		return dateFormat.format(date);
	}
	
	public MemberDetails mem = new MemberDetails(); 
	String mem_name = mem.getUsername();
	
	@Resource(name="memSer")
	private IMemberService memSer;
	
	@RequestMapping(value = "/authorized", method = RequestMethod.GET)
	public ModelAndView getAttended(MemberDetails this_member, HttpServletRequest req, HttpServletResponse res,
			Authentication auth, Model model) throws ServletException, IOException {
		System.out.println("getAttend 시작.");
		this_member = this_mem(this_member.getUsername());
		req.setAttribute("member", this_member);
		req.setAttribute("result", "valid");
		model.addAttribute("member", this_member);
		logger.info("Welcome. The client's locale is {}. Client is {}.", req.getLocale(), req.getAttribute("member"));
		model.addAttribute("result", "valid");
		model.addAttribute("greet", auth.getName()+"님, 반갑습니다.");
		System.out.println("request getAttribute result " + req.getAttribute("result"));

		System.out.println("request의 greet는 " + req.getAttribute("greet"));


		ModelAndView mv = new ModelAndView();
		List<?> AttendedLs = memDAO.selectAttended(auth.getName());
		mv.addObject("AttendedLs", AttendedLs);
		mv.setViewName("home");

		System.out.println("AttendedLs" + AttendedLs);
		return mv;
	}
	
	@RequestMapping(value="/doAttend", method=RequestMethod.POST)
	public ModelAndView doAttend(HttpServletRequest req) throws ServletException {
		System.out.println("doAttend IN");
		ModelAndView mv = new ModelAndView();
		
		memDAO.insertAttendedDate(req.getUserPrincipal().getName());
		System.out.println("가져오는 값이 진짜 오늘 날짜? "+req.getParameterValues("getDay"));
		mv.setViewName("home");

	
		return mv;
	}

}
