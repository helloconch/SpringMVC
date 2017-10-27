package com.conch.spring.controller;

import com.conch.spring.bean.Stock;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.text.DecimalFormat;

@Controller
public class IndexController {

    private final Log logger = LogFactory.getLog(IndexController.class);

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/calc")
    public void calc(@RequestBody Stock stock,
                     HttpServletResponse response) throws Exception {
        System.out.println("calc>>>>>>");
        DecimalFormat df = new DecimalFormat("#.00");
        ObjectMapper mapper = new ObjectMapper();
        double price = stock.getPrice();
        stock.setPriceR1(df.format(price * 1.01));
        stock.setPriceR2(df.format(price * 1.02));
        stock.setPriceR3(df.format(price * 1.03));
        stock.setPriceR4(df.format(price * 1.04));
        stock.setPriceR5(df.format(price * 1.05));
        stock.setPriceR6(df.format(price * 1.06));
        stock.setPriceR7(df.format(price * 1.07));
        stock.setPriceR8(df.format(price * 1.08));
        stock.setPriceR9(df.format(price * 1.09));
        stock.setPriceR10(df.format(price * 1.1));

        stock.setPriceY10(df.format(price*0.9));
        stock.setPriceY9(df.format(price*0.91));
        stock.setPriceY8(df.format(price*0.92));
        stock.setPriceY7(df.format(price*0.93));
        stock.setPriceY6(df.format(price*0.94));
        stock.setPriceY5(df.format(price*0.95));
        stock.setPriceY4(df.format(price*0.96));
        stock.setPriceY3(df.format(price*0.97));
        stock.setPriceY2(df.format(price*0.98));
        stock.setPriceY1(df.format(price*0.99));


        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(stock));
    }
}
