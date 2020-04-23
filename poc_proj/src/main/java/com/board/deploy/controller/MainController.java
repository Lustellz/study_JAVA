package com.board.deploy.controller;

import com.board.deploy.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {

    private PostRepository postRepository;

    @GetMapping("/")
    public String main() {
        return "main";
    }


}
