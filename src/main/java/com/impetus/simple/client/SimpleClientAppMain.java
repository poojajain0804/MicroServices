package com.impetus.simple.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import zipkin2.server.internal.EnableZipkinServer;



@SpringBootApplication
@EnableZipkinServer
public class SimpleClientAppMain extends SpringBootServletInitializer {

	private static final Logger logger= LoggerFactory.getLogger(SimpleClientAppMain.class);
	public static void main(String[] args) {
		
		logger.info("SimpleClientAppMain Application Straing");
		SpringApplication.run(SimpleClientAppMain.class, args);
		logger.info("SimpleClientAppMain Application Loading Finish");
	}
}
