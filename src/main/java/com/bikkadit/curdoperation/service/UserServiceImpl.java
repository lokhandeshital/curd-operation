package com.bikkadit.curdoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.bikkadit.curdoperation.entity.User;
import com.bikkadit.curdoperation.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUser(User user) {
		User saveUser = userRepo.save(user);
		return saveUser;
	}

	@Override
	public User updateUser(User user, Long userId) {

		User user2 = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User Not Found...." + userId));

		return user2;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getSingleUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub

	}

}
