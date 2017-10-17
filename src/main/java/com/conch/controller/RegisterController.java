package com.conch.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.conch.model.User;

@Controller
//将user放入HttpSession中
@SessionAttributes("user")
public class RegisterController {
	private ArrayList<User> users = new ArrayList();

	@RequestMapping(value = "/registerAction")
	public String registerAction(@RequestParam String username, @RequestParam String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		users.add(user);
		return "loginPage";
	}

	@RequestMapping(value = "/loginAction")
	public String loginAction(@RequestParam String username, @RequestParam String password,Model model) {
		//查找用户是否合法
		for(User user:users) {
			if(user.getUsername().equals(username)&&user.getPassword().equals(password)) {
				model.addAttribute("message", "欢迎你:"+username);
				model.addAttribute("user", user);
				return "hi";
			}
		}
		return "loginPage";
	}

}
