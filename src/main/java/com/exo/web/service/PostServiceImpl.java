package com.exo.web.service;

import java.util.List;

import com.exo.web.dao.PostDao;
import com.exo.web.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("postService")
@Transactional
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao dao;
    
	@Override
	public Post findById(int id) {
		return dao.findById(id);
	}

	@Override
	public Post findByTitle(String title) {
		return dao.findByTitle(title);
	}

	@Override
	public void submitPost(Post post) {
		dao.submitPost(post);		
	}

	@Override
	public List<Post> loadPage(int pageNumber) {
		List<Post> posts = dao.loadPage(pageNumber);
		return posts;
	}

}
