package com.student.management_system.Service;

import com.student.management_system.Model.Student;
import com.student.management_system.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // View student list
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Add new student / Update student details
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    // View student profile / Get details for update
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Delete student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}