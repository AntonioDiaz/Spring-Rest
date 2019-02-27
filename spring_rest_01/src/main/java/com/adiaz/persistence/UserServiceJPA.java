package com.adiaz.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adiaz.beans.User;

@Service
public class UserServiceJPA {
	
	@Autowired
	private UserRepository userRepository;
	
	public User findOne(Integer id) {
		return userRepository.findById(id).get();
	}
	

	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public List<User> findSome(Integer limit) {
		return userRepository.findAll().subList(0, limit);
	}
	
	
}
