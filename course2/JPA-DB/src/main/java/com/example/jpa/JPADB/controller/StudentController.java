package com.example.jpa.JPADB.controller;

import com.example.jpa.JPADB.model.Student;
import com.example.jpa.JPADB.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/s")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/insert")
    public ResponseEntity<?> saveStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/selectdata")
    public  ResponseEntity<?> getAllStudent(){
        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }

    @DeleteMapping("/deletedata/{Id}")
    public ResponseEntity<?> deleteByStudentID(@PathVariable String Id){
        return new ResponseEntity<>(studentService.deleteByStudentID(Id), HttpStatus.OK);
    }
}
