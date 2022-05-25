package com.example.com.service;

import java.util.List;

import com.example.com.entity.Major;
import com.example.com.entity.Student;


public interface DevService {

    public List<Student> getStudents();
    
    public List<Major> getMajors();

}