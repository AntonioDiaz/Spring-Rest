package com.adiaz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.adiaz.beans.User;
import com.adiaz.exceptions.UserNotFoundException;
import com.adiaz.persistence.UserServiceJPA;
import com.adiaz.services.UserDAOService;

@RestController
@RequestMapping("jpa")
public class UsersResourceJPAController {

	@Autowired
	private UserServiceJPA serviceUser;
	
	@GetMapping("/users")
	public List<User> usersRetrieve(@RequestParam(required=false) Integer numItems){
		if (numItems==null)
			return serviceUser.findAll();
		else 
			return serviceUser.findSome(numItems);		
	}
	
	@GetMapping("/users/{id}")
	public User usersRetrieve(@PathVariable int id) throws UserNotFoundException {
		try {
			User user = serviceUser.findOne(id);
			if (user==null) {
				throw new UserNotFoundException("No existe listillo");
			}
			return user;
		} catch (Exception e) {
			throw new UserNotFoundException("No existe listillo");
		}
	}
	
	
	
	
	
}
