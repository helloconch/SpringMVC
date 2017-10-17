package com.conch.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.conch.model.User;

@Controller
//��user����HttpSession��
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
		//�����û��Ƿ�Ϸ�
		for(User user:users) {
			if(user.getUsername().equals(username)&&user.getPassword().equals(password)) {
				model.addAttribute("message", "��ӭ��:"+username);
				model.addAttribute("user", user);
				return "hi";
			}
		}
		return "loginPage";
	}

}
