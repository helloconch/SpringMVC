package com.conch.spring.controller;

import com.conch.spring.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ModelController {
    @RequestMapping("/model")
    public String index(Model model) {
        Person single = new Person("Tuna", 10);
        List<Person> personList = new ArrayList<>();
        Person single1 = new Person("Tuna1", 11);
        Person single2 = new Person("Tuna2", 12);
        Person single3 = new Person("Tuna3", 13);
        personList.add(single1);
        personList.add(single2);
        personList.add(single3);

        model.addAttribute("singlePerson", single);

        model.addAttribute("people", personList);

        return "model";
    }
}
