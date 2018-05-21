package com.app.ecoforta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ecoforta.dao.UserDao;
import com.app.ecoforta.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService
{

	@Autowired
    private UserDao dao;
	
	@Override
	public User findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void registerUser(User user) {
		dao.registerUser(user);
	}

	@Override
	public void deleteUserById(int id) {
		dao.deleteUserById(id);
	}

	@Override
	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	@Override
	public User login(String username, String password) {
		return dao.login(username, password);
	}

	@Override
	public void updateUser(User user) 
	{		
		User entity = dao.findById(user.getId());
        if(entity!=null)
        {
        	entity.setAlamat(user.getAlamat());
        	entity.setAvatar(user.getAvatar());
        	entity.setEmail(user.getEmail());
        	entity.setId(user.getId());
        	entity.setJenisKelamin(user.getJenisKelamin());
        	entity.setLokasi(user.getLokasi());
        	entity.setNama(user.getNama());
        	entity.setPassword(user.getPassword());
        	entity.setRole(user.getRole());
        	entity.setTanggalLahir(user.getTanggalLahir());
        	entity.setUsername(user.getUsername());
        }
	}

}
