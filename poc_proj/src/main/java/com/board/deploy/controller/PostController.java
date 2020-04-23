package com.board.deploy.controller;

import com.board.deploy.dto.PostSaveReqDTO;
import com.board.deploy.repository.PostRepository;
import com.board.deploy.service.PostService;
import com.board.deploy.vo.Post;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    private PostRepository postRepository;

    @GetMapping({"", "/"})
    public String post(@RequestParam(value = "idx", defaultValue = "0") Long idx,
                       Model model) {
        model.addAttribute("post", postService.findPostByIdx(idx));
        return "/post/form";
    }

    @PostMapping("/upload")
    public void savePost(@RequestBody PostSaveReqDTO dto) {
        postRepository.save(dto.toEntity());
    }

    @GetMapping("/list")
    public String get_all_posts(@PageableDefault Pageable pageable, Model model) {
        Page<Post> postList = postService.findPostList(pageable);
        postList.stream().forEach(e -> e.getContent());
        model.addAttribute("postList", postList);

        return "main";
    }

}