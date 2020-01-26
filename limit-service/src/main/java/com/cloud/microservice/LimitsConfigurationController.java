package com.cloud.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.microservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping(path = "/limits")
	public LimitConfiguration retriveConfigurationLimites() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
