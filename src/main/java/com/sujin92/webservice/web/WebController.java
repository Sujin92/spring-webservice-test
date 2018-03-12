package com.sujin92.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/hello")
	public String test() {
		return "Hello Spring";
	}
}
