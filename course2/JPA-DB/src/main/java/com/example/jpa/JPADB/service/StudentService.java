package com.example.jpa.JPADB.service;

import com.example.jpa.JPADB.model.Student;
import com.example.jpa.JPADB.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService{

    private StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student saveStudent(Student student) {
       return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public boolean deleteByStudentID(String id) {
        studentRepo.deleteById(id);
        return true;
    }




}
