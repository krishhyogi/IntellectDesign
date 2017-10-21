package com.yogesh.springboot.service;


import com.yogesh.springboot.model.User;

public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);
	
	boolean isUserExist(User user);
	
}
