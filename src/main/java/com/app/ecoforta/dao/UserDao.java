package com.app.ecoforta.dao;

import java.util.List;

import com.app.ecoforta.model.User;

public interface UserDao 
{
	User findById(int id);
	 
    void registerUser(User user);
     
    void deleteUserById(int id);
     
    List<User> findAllUsers();
 
    User login(String username,String password);
}
