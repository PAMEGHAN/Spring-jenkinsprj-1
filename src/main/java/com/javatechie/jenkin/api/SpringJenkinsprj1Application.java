package com.javatechie.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsprj1Application {

	
public static Logger logger=LoggerFactory.getLogger(SpringJenkinsprj1Application.class);

@PostConstruct
public void intt() {
	logger.info("Application started...");
}
public static void main(String[] args) {
	logger.info("Application excecuted...");
	SpringApplication.run(SpringJenkinsprj1Application.class, args);
}
}