package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.repositories.UserRepository;


@RestController
@RequestMapping("/process")
public class CrudController {

@Autowired 
UserRepository usrRepository;
	//create
	
 @RequestMapping(method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
	public void createUser(User user)
	{
		usrRepository.save(user);
	}
	//read
	@RequestMapping(value="/{name}")
	public User readUser(@PathVariable String name)
	{
		return usrRepository.findOneByName(name);
		
	}
	//update
	@RequestMapping(method=RequestMethod.PUT,consumes= MediaType.APPLICATION_JSON_VALUE)
	public void updateUser(User user)
	{
		usrRepository.save(user);
	}
	//delete
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void deleteuser(@PathVariable String id)
	{
		usrRepository.delete(id);
	}
}
