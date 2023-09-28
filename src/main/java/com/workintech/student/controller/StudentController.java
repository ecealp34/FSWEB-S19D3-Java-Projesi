package com.workintech.student.controller;

import com.workintech.student.entity.Student;
import com.workintech.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> findAll() {
        return studentService.findAll();
    }
    @GetMapping("/{id}")
    public Student findById(@PathVariable int id) {
        return studentService.findById(id);
    }
    @PostMapping("/")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }
    @PutMapping("/{id}")
    public Student save(@RequestBody Student student, @PathVariable int id) {
        Student foundStudent = findById(id);
        if(foundStudent != null){
            student.setId(id);
            return studentService.save(student);
        }
        return null;
    }
    @DeleteMapping("/{tckn}")
    public Student delete(@PathVariable String tckn) {
        return studentService.delete(tckn);
    }
}
