package com.example.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.entity.DemoEntity;
import com.example.springdemo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	public DemoService iser;
	
	@PostMapping("/saveIPL")
	public DemoEntity addDetails(@RequestBody DemoEntity ia)
	{
		return iser.saveInfo(ia);
	}
}
	

 
