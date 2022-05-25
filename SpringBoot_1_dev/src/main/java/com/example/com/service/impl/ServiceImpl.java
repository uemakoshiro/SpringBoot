package com.example.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.com.dao.Dao;
import com.example.com.entity.Major;
import com.example.com.entity.Student;
import com.example.com.service.DevService;


@Service
public class ServiceImpl implements DevService {
    @Autowired
    private Dao dao;

    public List<Student> getStudents() {
        return dao.getStudents();
    }
    
    public List<Major> getMajors() {
        return dao.getMajors();
    }

}