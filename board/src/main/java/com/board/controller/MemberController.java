package com.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.MemberDTO;
import com.board.mapper.MemberMapper;
import com.board.service.MemberService;

@Controller
@RequestMapping("/user")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	
	
	@GetMapping("/logout")
	public String Logout() {
		return "redirect:/home";
	}
	
	@Autowired
	MemberMapper memberMapper;
	
	@PostMapping("/enroll")
	public String enrollMember(MemberDTO memberDTO) {
		memberService.joinUser(memberDTO);
		
		return "redirect:/user/login";
	}
	
	@RequestMapping(value="/loginProcess", method=RequestMethod.GET)
	public String Login(Model model, HttpServletRequest req) {
		model.addAttribute("message",req.getServletContext());
		return "login";
	}
	
	@GetMapping("/login/result")
	public String loginResult() {
		return "/main";
	}
	
	@GetMapping("/logout/result")
	public String logoutResult() {
		return "redirect:/";
	}
	
	@GetMapping("/loginSuccess")
	public String loginSuccess(HttpServletRequest req) {
		return memberService.loadUserByUsername(req.getUserPrincipal().getName()).getUsername();
	}
	
	@GetMapping("/myinfo")
	public String MyPage(){
		return "/personal";
	}
	
}
