package com.kingshing.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kingshing.entries.User;

@Controller
public class HelloController {
	/**
	 *  页面跳转 request传值
	 * @param name
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/hello.do")
	public String say(String name, Model model) {
		model.addAttribute("name", "==" + name);
		return "home";
	}

	/**
	 * ajax返回string
	 * 
	 * @param name
	 *            <input name="name" />
	 * @param response
	 */
	@RequestMapping(value = "/ajax.do")
	public void testAjax(String name, HttpServletResponse response) {
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
	/**
	 *  ajax 简单对象的双向传递
	 * @param User
	 * @return User
	 */
	@RequestMapping(value = "/ajaxObj.do")
	public @ResponseBody User testAjaxObj(@ModelAttribute User user) {
		System.out.println(user);
		User u = new User();
		u.setUserName("kingshing叶");
		u.setUserPswd("123");
		return u;
	}
}
