package com.example.com;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.com.entity.Major;
import com.example.com.entity.Student;
import com.example.com.service.DevService;


@SpringBootApplication
public class SpringBoot1DevApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
            SpringApplication.run(SpringBoot1DevApplication.class, args);

        DevService service = context.getBean(DevService.class);
        List<Student> studentList = service.getStudents();
        List<Major> majorList = service.getMajors();
        System.out.println("【student】");
        for (Student u : studentList) {
            System.out.println(u.getStudentInfo());
        }
        System.out.println("【major】");
        for (Major u : majorList) {
            System.out.println(u.getMajorInfo());
        }
    }

}

