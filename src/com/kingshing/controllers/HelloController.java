package com.kingshing.controllers;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

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
	/**
	 *  ajax返回string
	 * @param name   <input name="name" />
	 * @param response
	 */
	@RequestMapping(value="/ajax.do")
	public void testAjax(String name,HttpServletResponse response) {
		response.setContentType("text/html");
		System.out.println(name);
		try {
			PrintWriter writer = response.getWriter();
			writer.write("hello ajax!");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
