package com.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.MemberDTO;
import com.board.service.MemberService;

@Controller
public class MainController {
	
		private MemberService memberService;

		@RequestMapping(value="/login", method=RequestMethod.GET)
		public String LoginForm(Model model, HttpServletRequest req) {
			System.out.println("여기 자체를 안 온다니깐요.");
			return "login";
		}
		
		@GetMapping("/")
		public String home() {
			return "index";
		}
		
		@RequestMapping(value="/main", method=RequestMethod.GET)
		public String main(Model model, HttpServletRequest req) {
			System.out.println("안녕??");
			model.addAttribute("name", memberService.loadUserByUsername(req.getUserPrincipal().getName()));
			return "main";
		}

		@GetMapping("/signup")
		public String Signup(MemberDTO memberDTO) {
			return "signupForm";
		}
}
