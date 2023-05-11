package com.bikkadit.curdoperation.service;

import java.util.List;

import com.bikkadit.curdoperation.entity.User;

public interface UserService {

	public User createUser(User user);

	public User updateUser(User user, Long userId);

	public List<User> getAllUser();
	
	public User getSingleUser(Long userId);
	
	public void deleteUser(Long userId);

}
