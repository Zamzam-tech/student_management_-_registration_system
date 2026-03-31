package com.student.management_system.Repository;

import com.student.management_system.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Leave this empty! 
    // JpaRepository already contains: save(), findAll(), findById(), deleteById()
}