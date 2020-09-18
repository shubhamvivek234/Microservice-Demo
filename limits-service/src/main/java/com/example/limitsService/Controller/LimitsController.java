package com.example.limitsService.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsController {


	@Value("${limits-service.minimum}")
	private int minimum;


	@Value("${limits-service.maximum}")
	private int maximum;


	@GetMapping(path="/limits")
	public LimitService retrive() {
		return new LimitService(minimum,maximum);
	}


	@GetMapping(path="/limits")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration") 
	public LimitService retrieveConfiguration() 
	{ 
		throw new RuntimeException("Not available"); 

	}

	public LimitService fallbackRetrieveConfiguration()
	{
		return new LimitService (9,9999);
	}

}
