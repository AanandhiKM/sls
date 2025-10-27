package com.example.studentsback.repository;

import com.example.studentsback.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int register(Student student) {
        String sql = "INSERT INTO student(name, register_no, password) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, student.getName(), student.getRegisterNumber(), student.getPassword());
    }

    public boolean login(String registerNo, String password) {
        String sql = "SELECT COUNT(*) FROM student WHERE register_no=? AND password=?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, registerNo, password);
        return count != null && count > 0;
    }
}
