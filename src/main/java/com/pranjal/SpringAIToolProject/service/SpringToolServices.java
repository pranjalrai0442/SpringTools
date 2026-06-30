package com.pranjal.SpringAIToolProject.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranjal.SpringAIToolProject.tools.SpringAIToolClass;

@Service
public class SpringToolServices {

	
	@Autowired
	ChatClient chatclient;

	public String hello(String message) {
		// TODO Auto-generated method stub
		return chatclient.prompt().system("Answer all by reffering todays date carefully like year and all from the tool").tools(new SpringAIToolClass()).user(message).call().content();
	}
	
	
	
	
}
