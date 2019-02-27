package com.adiaz.controllers;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.adiaz.beans.User;
import com.adiaz.exceptions.UserNotFoundException;
import com.adiaz.services.UserDAOService;

@RestController
public class UsersResourceController {

	@Autowired
	private UserDAOService serviceUser;
	
	@GetMapping("/users")
	public List<User> usersRetrieve(){
		return serviceUser.findAll();
	}
	
	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public void usersCreate(@RequestBody User user) {
		serviceUser.save(user);
	}

	@GetMapping("/users/{id}")
	public Resource<User> usersRetrieve(@PathVariable int id) throws UserNotFoundException {
		User user = serviceUser.findUser(id);
		if (user==null) {
			throw new UserNotFoundException("No existe listillo");
		}
		Resource<User> resource = new Resource<>(user);
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).usersRetrieve());
		resource.add(linkTo.withRel("all-users"));
		return resource;
	}
	
	
}
