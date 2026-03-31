package com.student.management_system.Controller;

import com.student.management_system.Model.Student;
import com.student.management_system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students") // All URLs in this file start with /students
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Display student list (Requirement: View student list)
    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students"; // This looks for students.html in templates
    }

    // Show form to add a new student
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student"; // This looks for add-student.html
    }

    // Save the student from the form
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students"; // Go back to the list after saving
    }

    // Show form to update details
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "add-student"; // We can reuse the same form for editing!
    }

    // Delete student
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}