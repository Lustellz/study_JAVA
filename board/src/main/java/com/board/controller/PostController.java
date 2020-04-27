package com.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.board.domain.Post;
import com.board.mapper.PostMapper;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostMapper postMapper;
	
	@RequestMapping(value="/list", method= RequestMethod.GET)
	public ModelAndView get_all_posts() throws Exception{
		List<Post> posts = postMapper.postList();
		return new ModelAndView("postList", "list", posts);
	}
	
	@RequestMapping(value="/new",method= RequestMethod.GET)
	public ModelAndView create() throws Exception{
		return new ModelAndView("writeForm");
	}
	
	@RequestMapping(value="/submit", method= RequestMethod.POST)
	public String submit(@ModelAttribute("Post") Post post) throws Exception{
		postMapper.postInsert(post);
		return "redirect://localhost:8080/list";
	}
	
	@RequestMapping(value="/{idx}", method=RequestMethod.GET)
	public ModelAndView post_view(@PathVariable("idx") int idx)throws Exception{
		
		Post post = postMapper.postView(idx);
		postMapper.hitPlus(idx);
		
		return new ModelAndView("postView","post",post);
		
	}
	
	@RequestMapping(value="/update/{idx}", method=RequestMethod.GET)
	public ModelAndView PostForm(@PathVariable("idx") int idx) throws Exception{
		Post post = postMapper.postView(idx);
		
		return new ModelAndView("postUpdate", "post", post);
	}
} 
