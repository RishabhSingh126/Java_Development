package com.tut9.spring.learn_spring_framework.enterprises.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tut9.spring.learn_spring_framework.enterprises.data.DataService;

@Component
public class BusinessService{
	
	@Autowired
	private DataService dataServcie;
	
	public BusinessService(DataService dataServcie) {
		super();
		System.out.println("Constructor Injection in BusinessService");
		this.dataServcie = dataServcie;
	}

	//@Autowired
	//public void setDataServcie(DataService dataServcie) {
	//	System.out.println("Setter Injection");
	//	this.dataServcie = dataServcie;
	//}
	
	
	public long calculateSum() {
		List<Integer> data = dataServcie.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}

