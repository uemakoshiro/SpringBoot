package com.example.com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.com.dao.Dao;
import com.example.com.entity.Major;
import com.example.com.entity.Student;

@Repository
public class PgDao implements Dao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getStudents() {
        return jdbcTemplate.query("SELECT s.student_id, s.student_name, s.grade, s.hometown, s.major_id, m.major_name FROM student s JOIN major m ON s.major_id = m.major_id ORDER BY student_id",
            new BeanPropertyRowMapper<Student>(Student.class));
    }
    
    public List<Major> getMajors() {
        return jdbcTemplate.query("SELECT * FROM major ORDER BY major_id",
            new BeanPropertyRowMapper<Major>(Major.class));
    }
}
