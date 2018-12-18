package com.impetus.simple.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impetus.simple.client.configuration.SimpleClientAppConfig;

@RestController
@RequestMapping("/rest/microapp1")
public class SimpleClientAppController {

	private static final Logger logger = LoggerFactory.getLogger(SimpleClientAppController.class.getName());
	@Autowired
	private SimpleClientAppConfig simpleClientAppConfig;
	
	@GetMapping(value = "/welcomeClient1")
	public String printWelcomeMsg() {
		logger.info("Before calling Client 2 mapping welcomeClient1 method");
		String response = simpleClientAppConfig.restTemplate().getForObject("http://localhost:8006/rest/microapp2/welcomeClient2", String.class);

		logger.info("After calling Client 2 mapping welcomeClient1 method");
		return response;
	}

}
