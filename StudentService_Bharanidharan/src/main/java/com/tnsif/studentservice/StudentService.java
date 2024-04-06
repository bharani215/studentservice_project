package com.tnsif.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {
 @Autowired
 private StudentRepository studentRepository;

 public List<Student> getAllStudents() {
     return studentRepository.findAll();
 }

 public Student getStudentById(Long id) {
     return studentRepository.findById(id).orElse(null);
 }

 public Student createStudent(Student student) {
     return studentRepository.save(student);
 }

 public void deleteStudent(Long id) {
     studentRepository.deleteById(id);
 }
}
