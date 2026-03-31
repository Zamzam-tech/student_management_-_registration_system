package com.student.management_system.Model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name="StudentTable")
public class Student {
    // Primary key with auto-increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Unique identifier for each student
    
    private Long id;
    private String name;
    private String email;
    private String program;
    private Integer yearOfStudy;

// This MUST match exactly what Spring expects
public Integer getYearOfStudy() {
    return yearOfStudy;
}

public void setYearOfStudy(Integer yearOfStudy) {
    this.yearOfStudy = yearOfStudy;
} 
}
