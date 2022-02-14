package com.example.jpa.JPADB.service;

import com.example.jpa.JPADB.model.Student;

import java.util.List;

public interface IStudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudent();
    boolean deleteByStudentID(String id);
}
