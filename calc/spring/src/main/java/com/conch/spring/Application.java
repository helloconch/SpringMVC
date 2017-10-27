package com.conch.spring;

import com.conch.spring.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
    //获取配置中自定义的属性信息
    @Value("${userinfo.name}")
    private String usename;
    //类型安全配置基于properties
    @Autowired
    private Book book;

    @RequestMapping("/hello")
    public String index() {
        return "Hello Spring Boot"
                + "[ "
                + "usename:" + usename
                + " ]"
                + "[ "
                + "book:" + book.getName()
                + " ]"
                ;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 关闭Banner
     *
     * @param args
     */
    private void cancelBanner(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
