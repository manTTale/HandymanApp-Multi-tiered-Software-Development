package com.proiect.mrc.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/handymanApp")
public class MainController {
	Logger myLogger = Logger.getLogger(getClass().getName());
	
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		myLogger.info("Inside the showMyLoginPage");
		return "showMyLoginPage";
	}

}
