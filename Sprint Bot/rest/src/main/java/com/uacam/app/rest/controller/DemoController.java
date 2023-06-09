package com.uacam.app.rest.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class DemoController {
	
	@GetMapping("/index")
	public String index(@RequestParam( name="name", required=false, defaultValue="World") 
	String name, Model model) {
		
		model.addAttribute("name", name);
		return "index";
	}
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World")
	String name, Model model) {

		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/egresados")
	public String egresados(@RequestParam(name="name", required=false, defaultValue="World")
	String name, Model model) {

		model.addAttribute("name", name);
		return "egresados";
	}
	
}
