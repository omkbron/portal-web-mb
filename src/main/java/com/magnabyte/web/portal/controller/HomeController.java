package com.magnabyte.web.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String index() {
		logger.debug("Redireccionando a home...");
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home() {
		logger.debug("home...");
		return "home";
	}
}
