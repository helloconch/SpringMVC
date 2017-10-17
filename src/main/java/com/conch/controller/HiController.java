package com.conch.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiController {
	private final Log logger = LogFactory.getLog(HiController.class);

	/**
	 * 不携带数据返回hi.jsp
	 * 
	 * @return
	 */
	@RequestMapping(value = "/hello1")
	public String hello1() {
		logger.info("HiController>>>>>>>sayHi");
		return "hi";
	}

	@RequestMapping(value = "/hello2")
	public String hello2(Model model) {
		logger.info("HiController>>>>>>>hello");
		model.addAttribute("message", "from class HiController method hello2");
		return "hi";
	}

}
