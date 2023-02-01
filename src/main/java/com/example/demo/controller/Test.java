package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test {

    @Autowired
    private UserMapper mapper;


    @GetMapping("/")
    public String test(String demo){
        return demo;
    }

    @GetMapping("/login")
    public User getUserInfo(@RequestParam int id){



        User userInfo = mapper.getUserInfo(id);
        return userInfo;
    }
}
