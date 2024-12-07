package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController 
{
	@Autowired
	private OrderService service;
	@GetMapping("/")
	public String home()
	{
		return "Spring Boot Rest API and JPA";
	}
	
	@PostMapping("add")
	public String addorder(@RequestBody Order order)
	{
		return service.addOrder(order);
	}
	
	
	
	
	
	
	

}
