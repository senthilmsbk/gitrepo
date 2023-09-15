package com.employee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@RequestMapping("/test")
	String empTest() {
		return "This is dept  service";
	}

}