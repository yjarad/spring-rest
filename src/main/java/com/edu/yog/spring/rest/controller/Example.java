package com.edu.yog.spring.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping(consumes = { "text/plain", "application/*" }, method = RequestMethod.POST, produces = {
			"text/plain", "application/*" }, value = "/submit")
	public void submit(@RequestBody Object body) {
		System.out.println(" See wha got form request " + body);
	}
}
