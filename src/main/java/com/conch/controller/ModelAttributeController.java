package com.conch.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.conch.model.User;

@Controller
public class ModelAttributeController {
	private final Log logger = LogFactory.getLog(ModelAttributeController.class);

	/**
	 * 修饰的userModel方法优先于modelAttributeAction调用 该方法接受前台jsp页面传入的参数
	 */
	@ModelAttribute
	public void useModel(String username, String password, Model model) {
		logger.info("ModelAttributeController>>>>>>>useModel");
		User user = new User();
		// 对传进来的值进行更改
		user.setUsername("update" + username);
		user.setPassword(password);
		model.addAttribute("user", user);
	}

	@RequestMapping(value = "/modelAttributeAction")
	public String modelAttributeAction(Model model) {
		if (model.asMap().get("user") != null) {
			User user = (User) model.asMap().get("user");
			logger.info("ModelAttributeController>>>>>>>modelAttributeAction>>>>username:" + user.getUsername());
			model.addAttribute("message", user.getUsername());
		}
		return "hi";
	}

	/**
	 * 测试@ModelAttribute(value="")注释返回具体类的方法
	 * 
	 * @param username
	 * @return
	 */
	@ModelAttribute("username")
	public String userModel2(@RequestParam("username") String username) {
		logger.info("ModelAttributeController>>>>>>>userModel2");
		// 将属性值username分发出去
		return username;
	}

	@RequestMapping(value = "/loginFormAction1")
	public String loginFormAction1() {
		return "hi";
	}

	/**
	 * 测试@ModelAttribute注释void返回值的方法
	 * 
	 * @param name
	 * @param password
	 * @param model
	 */

	@ModelAttribute()
	public void userModel2(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		model.addAttribute("username", username);
		model.addAttribute("password", password);
	}

	@RequestMapping(value = "/loginFormAction2")
	public String loginFormAction2() {
		return "hi";
	}

	/**
	 * 测试@ModelAttribute和@RequestMapping同时注释一个方法
	 * 此时loginFormAction3方法返回值不是一个视图名称，而是model的属性值username(key)=welcome(value)
	 * 视图名称是@RequestMapping(value = "/hi")中value值hi
	 * @return
	 */
	@RequestMapping(value = "/hi")
	@ModelAttribute(value = "username")
	public String hi() {
		return "welcome";
	}
	
	
	/**
	 * 测试@ModelAttribute注释一个方法的参数
	 */

	@ModelAttribute("userInfo")
	public User userModel5(@RequestParam("username") String username, @RequestParam("password") String password) {
		User userInfo = new User();
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		return userInfo;
	}

	@RequestMapping(value = "/loginFormAction3")
	public String loginFormAction3(@ModelAttribute("user") User user) {
		user.setUsername("admin");
		return "hi";
	}

}
