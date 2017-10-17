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
	 * ���ε�userModel����������modelAttributeAction���� �÷�������ǰ̨jspҳ�洫��Ĳ���
	 */
	@ModelAttribute
	public void useModel(String username, String password, Model model) {
		logger.info("ModelAttributeController>>>>>>>useModel");
		User user = new User();
		// �Դ�������ֵ���и���
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
	 * ����@ModelAttribute(value="")ע�ͷ��ؾ�����ķ���
	 * 
	 * @param username
	 * @return
	 */
	@ModelAttribute("username")
	public String userModel2(@RequestParam("username") String username) {
		logger.info("ModelAttributeController>>>>>>>userModel2");
		// ������ֵusername�ַ���ȥ
		return username;
	}

	@RequestMapping(value = "/loginFormAction1")
	public String loginFormAction1() {
		return "hi";
	}

	/**
	 * ����@ModelAttributeע��void����ֵ�ķ���
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
	 * ����@ModelAttribute��@RequestMappingͬʱע��һ������
	 * ��ʱloginFormAction3��������ֵ����һ����ͼ���ƣ�����model������ֵusername(key)=welcome(value)
	 * ��ͼ������@RequestMapping(value = "/hi")��valueֵhi
	 * @return
	 */
	@RequestMapping(value = "/hi")
	@ModelAttribute(value = "username")
	public String hi() {
		return "welcome";
	}
	
	
	/**
	 * ����@ModelAttributeע��һ�������Ĳ���
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
