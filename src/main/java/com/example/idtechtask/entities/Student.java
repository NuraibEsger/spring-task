package com.example.idtechtask.entities;

import lombok.Data;

@Data
public class Student {
    private String name;

    public void displayName() {
        System.out.println("First Name: " + name);
    }
}
