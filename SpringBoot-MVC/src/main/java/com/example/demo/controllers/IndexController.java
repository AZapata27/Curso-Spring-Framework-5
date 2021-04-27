package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	
	@RequestMapping({"/index","/","/home"})
	public String index(ModelMap model){
		model.addAttribute("titulo", "Hola Spring Framework");
		return "index";
	}
}