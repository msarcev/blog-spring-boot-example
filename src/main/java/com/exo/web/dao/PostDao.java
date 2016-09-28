package com.exo.web.dao;

import java.util.List;

import com.exo.web.model.Post;

public interface PostDao {

	Post findById(int id);
    
	Post findByTitle(String title);
	
	void submitPost(Post post);
	
	List<Post> loadPage(int pageNumber);
}