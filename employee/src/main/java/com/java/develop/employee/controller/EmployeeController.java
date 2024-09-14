package com.java.develop.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.develop.employee.exception.ResourceNotFoundExcption;

@RestController
public class EmployeeController {
	
	@GetMapping("/user")
	public List<String> getTest(@RequestParam("id") String id) {
		List<String> lst = new ArrayList<>();
		lst.add("123");
		lst.add("521");
		
		if (lst.contains(id)) {
			return lst;
			
		} 
		else {
			return (List<String>) new ResourceNotFoundExcption("Not found");
		}
		
		
	}
	

}
