package com.example.idtechtask.controller;

import com.example.idtechtask.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/students")
public class StudentController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/get")
    public String sayHello() {
        return helloService.sayHello();
    }
}
