package com.example.idtechtask;

import com.example.idtechtask.entities.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IdTechTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdTechTaskApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("studentBean");

        student.displayName();
    }

}
