package com.workintech.student.repository;

import com.workintech.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("SELECT s FROM Student s WHERE s.tckn = :tckn")
    Optional<Student> findStudentByTckn(String tckn);
}
