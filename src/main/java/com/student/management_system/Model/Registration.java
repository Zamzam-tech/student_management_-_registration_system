package com.student.management_system.Model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name="RegistrationTable")

public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Foreign key referencing the student
    @ManyToOne // Many registrations can be associated with one student
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    private String semester;
}
