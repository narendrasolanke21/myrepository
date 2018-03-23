package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(basePath = "/user")
@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAllUsers() {
		ArrayList<User> list=new ArrayList<>();
		list.add(new User("john",30000l));
		list.add(new User("alex",50000l));
		list.add(new User("Rick",60000l));
		return list;
	}
	
	@RequestMapping(value="adduser/{id}",method=RequestMethod.POST)
	public List<User> addUser(@PathVariable("id") String userId) {
		ArrayList<User> list=new ArrayList<>();
		list.add(new User(userId,10000l));
		return list;
	}
	

	@RequestMapping(value="/abha",method=RequestMethod.GET)
	public String addUser() {
		String test="hello mahapagl abha";
		return test;
	}
	
	
	
	
	
	
}
