package com.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.service.MailHandler;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class EmailController {
	
	@Autowired
	MailHandler mailHandler;
	
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public String give_inst(HttpServletRequest req) {
		mailHandler.send();
		return "home";
	}
}
