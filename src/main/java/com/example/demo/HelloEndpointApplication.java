package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
@RestController

public class HelloEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloEndpointApplication.class, args);
	}
   @GetMapping
   public String status() throws UnknownHostException{
	   return "status-up"+InetAddress.getLocalHost().toString();
	   
   }
   
}
