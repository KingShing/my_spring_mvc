package com.kingshing.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="/hello.do")
	public String say(String name,Model model) {
		model.addAttribute("name", "=="+name);
		return "home";
	}
}
