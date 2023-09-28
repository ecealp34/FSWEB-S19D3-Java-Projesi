package com.workintech.student.service;


import com.workintech.student.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int id);
    Student save(Student student);
    Student delete(String tckn);
}
