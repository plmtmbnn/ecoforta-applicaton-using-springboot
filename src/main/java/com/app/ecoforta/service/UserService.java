package com.app.ecoforta.service;

import java.util.List;

import com.app.ecoforta.model.Produk;
import com.app.ecoforta.model.User;

public interface UserService 
{
	User findById(int id);
	 
    void registerUser(User user);
     
    void deleteUserById(int id);
     
    List<User> findAllUsers();
 
    User login(String username,String password);
    
    void updateUser(User user);
    

    
}
