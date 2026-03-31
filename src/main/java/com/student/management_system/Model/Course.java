package com.student.management_system.Model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="CourseTable")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseCode;
    private String courseName;
    private String Lecturer;
    private Integer credits;
}