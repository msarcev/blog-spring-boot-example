package com.exo.web.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import com.exo.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exo.web.model.Post;
import com.exo.web.service.PostService;
import com.exo.web.service.UserService;

@Controller
public class SubmitPostController {
	Authentication auth;	
	 @Autowired
	    private UserService userService;
	 @Autowired
	    private PostService postService ;
	@Transactional
    @RequestMapping(value = "submitPost" , method = RequestMethod.POST)
    public String addPost (@ModelAttribute(value = "addPost")Post newPost,
                           ModelMap modelMap, HttpSession session){
    	
		auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findBySso(auth.getName());
        newPost.setAccountId(user.getId());
        Date now = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        ft.format(now);
        newPost.setDatetime(now);
        
        postService.submitPost(newPost);
        
        return "redirect:/admin";
    }
}
