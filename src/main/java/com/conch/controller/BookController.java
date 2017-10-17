package com.conch.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.conch.model.Book;

@Controller
@RequestMapping("/json")
public class BookController {
	private static final Log logger = LogFactory.getLog(BookController.class);

	/**
	 * @RequestBody����json���ݣ�ת���ɶ�Ӧ��Object
	 * @param book
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/testRequestBody")
	public void testRequestBody(@RequestBody Book book, HttpServletResponse response) throws Exception {
		logger.info("#############testBodyRequestTest#############");
		// ObjectMapper��Jackson����Ҫ�࣬�ṩһЩ���ܽ�Java����ת���ɶ�Ӧ��JSON��ʽ������
		// ��Ҫ����jackson-mapper-asl
		ObjectMapper mapper = new ObjectMapper();
		logger.info(mapper.writeValueAsString(book));
		book.setAuthor("che");
		response.setContentType("text/html;charset=UTF-8");
		// ��book����ת����jsonд���ͻ���
		response.getWriter().println(mapper.writeValueAsString(book));
	}
}
