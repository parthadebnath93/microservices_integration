package com.practice.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallack")
	public String userServiceFallBackControllerMethod(){
		return "User Service is taking time than expected, please try later";
	}
	
	@GetMapping("/departmentServiceFallack")
	public String departmentServiceFallBackControllerMethod(){
		return "Department Service is taking time than expected, please try later";
	}
}
