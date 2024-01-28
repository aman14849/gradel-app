package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradelController {

	
	@GetMapping("test")
	public String getAppStatus() {
		return "running!";
	}
}
