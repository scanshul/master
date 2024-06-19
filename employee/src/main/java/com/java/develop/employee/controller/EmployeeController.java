package com.java.develop.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/users")
	public List<String> getTest() {
		List<String> lst = new ArrayList<>();
		lst.add("Hello");
		return lst;
	}

}
