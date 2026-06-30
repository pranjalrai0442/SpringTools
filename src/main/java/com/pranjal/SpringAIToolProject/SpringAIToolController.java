package com.pranjal.SpringAIToolProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pranjal.SpringAIToolProject.service.SpringToolServices;

@RestController
public class SpringAIToolController {

	@Autowired
	SpringToolServices serv;
	
	
	@GetMapping("/chat/{message}")
	public String hello(@PathVariable String message) {
		
		return serv.hello(message);
		
	}
	
	
}
