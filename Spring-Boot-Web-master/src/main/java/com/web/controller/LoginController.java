package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.web.annotation.SocialUser;
import com.web.domain.User;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/loginsuccess")
    public String loginComplete(@SocialUser User user) {
        return "redirect:/board/list";
    }
}
