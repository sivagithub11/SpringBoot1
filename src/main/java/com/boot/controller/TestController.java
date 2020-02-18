package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	@RequestMapping("/arun")
	public ModelAndView hello1(){
		System.out.println("this is /arun");
	return new ModelAndView("asd");
	}
}
