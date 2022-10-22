package com.proiect.mrc.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/handymanApp/client")
public class ClientController {
	
	Logger myLogger = Logger.getLogger(getClass().getName());
	@GetMapping("/clientHomePage")
	public String showHomePage(){
		myLogger.info("Inside the showHomePage");
		return "/clientViews/clientHomePage";		
	}
	
	

}