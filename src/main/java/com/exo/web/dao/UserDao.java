package com.exo.web.dao;

import com.exo.web.model.User;

public interface UserDao {
	 
    User findById(int id);
     
    User findBySSO(String sso);
     
}