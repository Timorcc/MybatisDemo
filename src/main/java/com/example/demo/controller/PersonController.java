package com.example.demo.controller;

import com.example.demo.bean.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/add")
    public int add(){
        Person person = new Person(2,"test",30);
      int res = personService.insert(person);
        System.out.println("--------------");
        return res;
    }
}
