package com.adiaz.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.adiaz.beans.User;

@Component
public class UserDAOService {

	
	private static List<User> users = new ArrayList<>();
	private static int usersCont = 3;
	
	static {
		users.add(new User(1, "rafa", new Date()));
		users.add(new User(2, "antonio", new Date()));
		users.add(new User(3, "pepinillo", new Date()));		
	}

	public List<User> findAll(){
		return users;
	}
	
	public User findUser(Integer id){
		return users.stream().filter(x -> id.equals(x.getId())).findAny().orElse(null);
	}

	public User save(User user) {
		users.add(user);
		return user;
	}
}


