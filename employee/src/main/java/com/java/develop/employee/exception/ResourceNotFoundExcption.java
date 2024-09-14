package com.java.develop.employee.exception;

import lombok.Data;

@Data
public class ResourceNotFoundExcption extends Exception {
	String sourceName;
	
	public ResourceNotFoundExcption(String sourceName) {
		this.sourceName = sourceName;
	}

}
