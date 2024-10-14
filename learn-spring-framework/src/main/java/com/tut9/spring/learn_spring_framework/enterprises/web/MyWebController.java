package com.tut9.spring.learn_spring_framework.enterprises.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tut9.spring.learn_spring_framework.enterprises.business.BusinessService;

@Component
public class MyWebController {	
	
	@Autowired
	private BusinessService businessService;
	
	public MyWebController(BusinessService businessService) {
		super();
		System.out.println("Constructor Injection in MyWebController");
		this.businessService = businessService;
	}



	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}
