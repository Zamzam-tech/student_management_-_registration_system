package com.student.management_system.Controller;

import com.student.management_system.Model.Course;
import com.student.management_system.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // View course list
    @GetMapping
    public String listCourses(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses"; // Look for courses.html
    }

    // Show form to add a course
    @GetMapping("/new")
    public String showAddCourseForm(Model model) {
        model.addAttribute("course", new Course());
        return "add-course"; // Look for add-course.html
    }

    // Save course
    @PostMapping("/save")
    public String saveCourse(@ModelAttribute("course") Course course) {
        courseService.saveCourse(course);
        return "redirect:/courses";
    }

    // Delete course
    @GetMapping("/delete/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return "redirect:/courses";
    }
}