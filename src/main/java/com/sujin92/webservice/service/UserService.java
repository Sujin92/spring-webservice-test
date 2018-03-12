package com.sujin92.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujin92.webservice.domain.User;
import com.sujin92.webservice.domain.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public void GetList() {
		
	List<User> userList = repository.findAll();
	}

}
