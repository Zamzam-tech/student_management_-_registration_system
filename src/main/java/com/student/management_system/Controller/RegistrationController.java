package com.student.management_system.Controller;

import com.student.management_system.Model.Registration;
import com.student.management_system.Service.RegistrationService;
import com.student.management_system.Service.StudentService;
import com.student.management_system.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;

    // DASHBOARD: Requirement #4 (The Homepage)
    @GetMapping("/")
    public String showDashboard(Model model) {
        model.addAttribute("totalStudents", registrationService.getTotalStudents());
        model.addAttribute("totalCourses", registrationService.getTotalCourses());
        model.addAttribute("totalRegistrations", registrationService.getTotalRegistrations());
        return "index"; // This will be your homepage (index.html)
    }

    // SHOW REGISTRATION FORM
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new Registration());
        model.addAttribute("students", studentService.getAllStudents()); // To pick a student
        model.addAttribute("courses", courseService.getAllCourses());   // To pick a course
        return "register-course"; 
    }

    // SAVE REGISTRATION (With the extra logic we added!)
    @PostMapping("/register/save")
    public String saveRegistration(@ModelAttribute("registration") Registration registration, Model model) {
        String result = registrationService.registerStudent(registration);
        
        if (result.startsWith("Error")) {
            model.addAttribute("errorMessage", result);
            model.addAttribute("students", studentService.getAllStudents());
            model.addAttribute("courses", courseService.getAllCourses());
            return "register-course"; // Stay on page to show error
        }
        
        return "redirect:/"; // Go to dashboard on success
    }

    // VIEW REGISTERED COURSES (Requirement: View courses by student)
    @GetMapping("/student-courses/{id}")
    public String viewStudentCourses(@PathVariable Long id, Model model) {
        model.addAttribute("registrations", registrationService.getRegistrationsByStudent(id));
        model.addAttribute("student", studentService.getStudentById(id));
        return "student-profile";
    }
}