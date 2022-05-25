package com.example.com.dao;

import java.util.List;

import com.example.com.entity.Major;
import com.example.com.entity.Student;

public interface Dao {

    public List<Student> getStudents();
    
    public List<Major> getMajors();

}