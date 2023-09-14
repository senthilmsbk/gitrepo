package com.employee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@RequestMapping("/test")
	String empTest() {
		return "This is employee service";
	}

}