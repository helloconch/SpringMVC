package com.conch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	/**
	 * ��action�ַ�����Ӧ��jsp page
	 * 
	 * @param formName
	 * @return
	 */
	@RequestMapping(value = "/{formName}")
	public String loginForm(@PathVariable String formName) {
		return formName;
	}

}
