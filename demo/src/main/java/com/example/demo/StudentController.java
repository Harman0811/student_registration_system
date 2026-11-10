package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController{

    @Autowired
    private StudentRepository repo;

    @GetMapping("/")
    public String form() {
        return "register";
    }

    @PostMapping("/save")
    public String save(@RequestParam String name,
                       @RequestParam String email,
                       @RequestParam String course,
                       Model model) {

        Student s = new Student(name, email, course);
        repo.save(s); // SAVE TO DATABASE

        model.addAttribute("student", s);
        return "success";
    }

    @GetMapping("/students")
    public String viewStudents(Model model) {
        model.addAttribute("list", repo.findAll());
        return "students";
    }
}