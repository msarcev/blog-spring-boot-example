package com.exo.web.service;

import com.exo.web.model.User;

public interface UserService {
	 
    User findById(int id);
     
    User findBySso(String sso);
     
}
