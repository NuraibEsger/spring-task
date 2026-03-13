package com.example.idtechtask.entities;

import com.example.idtechtask.services.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class Student {

    @Autowired
    private StudentService studentService;

    private String name;

    public void displayName() {
        System.out.println("First Name: " + name);
    }
}
