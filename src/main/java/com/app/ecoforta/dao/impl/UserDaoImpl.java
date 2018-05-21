package com.app.ecoforta.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.app.ecoforta.dao.AbstractDao;
import com.app.ecoforta.dao.UserDao;
import com.app.ecoforta.model.User;
 
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao
{

	@Override
	public User findById(int id) {
		return getByKey(id);
	}

	@Override
	public void registerUser(User user) {
	persist(user);	
	}

	@Override
	public void deleteUserById(int id) {
		 Query query = getSession().createSQLQuery("delete from User where id = :id");
	        query.setInteger("id", id);
	        query.executeUpdate();	
	}

	@SuppressWarnings("unchecked")	
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
	}

	@Override
	public User login(String username, String password) {
		List<User> users = findAllUsers();
		
		for (User user : users) 
		{
			if(user.getUsername().equals(username) && user.getPassword().equals(password))
			{
				return user;
			}
		}
		return null;
	}
}
