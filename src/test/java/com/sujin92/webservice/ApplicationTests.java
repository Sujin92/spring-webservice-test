package com.sujin92.webservice;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sujin92.webservice.domain.User;
import com.sujin92.webservice.domain.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	UserRepository repository;

	@Test
	public void getList() {
		List<User> postsList = repository.findAll();
		
		for (int i=0; i<postsList.size(); i++) {
			User user = postsList.get(i);
			System.out.println(user.toString());
			
		}
	}

}
