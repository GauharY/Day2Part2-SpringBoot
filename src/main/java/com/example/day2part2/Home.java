package com.example.day2part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
//    @GetMapping("/home")
//    public String home(){
//        return "This is the home page";
//    }
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student = new StudentModel(1, "gauhar", "gauharyadav@email.com");
        return student;
    }
}
