package com.student.management_system.Service;

import com.student.management_system.Model.Registration;
import com.student.management_system.Repository.RegistrationRepository;
import com.student.management_system.Repository.StudentRepository;
import com.student.management_system.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;
    
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private CourseRepository courseRepository;

    // Logic: Register a student for a course
    public String registerStudent(Registration registration) {
        // EXTRA CREDIT LOGIC: Check if this student is already in this course
        List<Registration> existing = registrationRepository.findByStudentId(registration.getStudent().getId());
        for (Registration r : existing) {
            if (r.getCourse().getId().equals(registration.getCourse().getId())) {
                return "Error: Student is already registered for this course!";
            }
        }
        
        registrationRepository.save(registration);
        return "Success: Registration complete!";
    }

    public List<Registration> getRegistrationsByStudent(Long studentId) {
        return registrationRepository.findByStudentId(studentId);
    }

    public void dropCourse(Long registrationId) {
        registrationRepository.deleteById(registrationId);
    }

    // DASHBOARD METHODS (Requirement #4 in your text)
    public long getTotalStudents() {
        return studentRepository.count();
    }

    public long getTotalCourses() {
        return courseRepository.count();
    }

    public long getTotalRegistrations() {
        return registrationRepository.count();
    }
}