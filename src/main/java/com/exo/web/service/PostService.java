package com.exo.web.service;

import java.util.List;

import com.exo.web.model.Post;

public interface PostService {

	Post findById(int id);
    
	Post findByTitle(String title);
	
	void submitPost(Post post);
	
	List<Post> loadPage(int pageNumber);
}
