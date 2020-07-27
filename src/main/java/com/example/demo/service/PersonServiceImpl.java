package com.example.demo.service;

import com.example.demo.bean.Person;
import com.example.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public int insert(Person person) {
        return personMapper.insert(person);
    }
}
