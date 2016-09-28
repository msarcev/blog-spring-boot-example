package com.exo.web.controllers;

import java.util.List;

import com.exo.web.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exo.web.service.PostService;

@RestController
public class LoadPostsController {	

	@Autowired
    private PostService postService ;
	
	@Transactional
	@RequestMapping("/posts")
	public List<Post> getPosts(Model model){
		
		return postService.loadPage(1);
	}

}
