package com.lili.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtrlHelloSpringBoot {
	@RequestMapping(value= {"/helloSpringBoot"})
	public String helloSpringBoot() {
		return "Hello Spring Boot";
	}
}
