package com.conch.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataBindController {
	private static final Log logger = LogFactory.getLog(DataBindController.class);
	
	@RequestMapping(value="/databind")
	public String intoDataBind() {
		return "databind";
	}

	@RequestMapping(value = "/pathVariable/{userId}")
	public void pathVariableTest(@PathVariable Integer userId) {
		logger.info("ͨ��@PathVariable��ȡuserId��" + userId);
	}

	@RequestMapping(value = "/requestHeader")
	public void requestHeanderTest(@RequestHeader("User-Agent") String userAgent,
			@RequestHeader(value = "Accept") String[] accepts) {
		logger.info("ͨ��@RequestHeader��ȡuserAgent��" + userAgent);

		for (String accept : accepts) {
			logger.info("ͨ��@RequestHeader��ȡaccept��" + accept);
		}

	}

	@RequestMapping(value = "/cookieValueTest")
	public void cookieValueTest(@CookieValue(value="JSESSIONID",defaultValue="")String sessionId) {
		logger.info("ͨ��@cookieValueTest��ȡsessionId��" + sessionId);
	}
}
