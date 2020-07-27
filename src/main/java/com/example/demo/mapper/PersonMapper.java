package com.example.demo.mapper;

import com.example.demo.bean.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PersonMapper {
@Insert("insert into person(id,name,age) values (#{id},#{name},#{age})")
    int insert(Person person);
}
