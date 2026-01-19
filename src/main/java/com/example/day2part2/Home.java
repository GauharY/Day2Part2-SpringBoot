package com.example.day2part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    @GetMapping("/listings")
    public List<StudentModel> listing(){
        List<StudentModel> students = new ArrayList<>();
        students.add(new StudentModel(2, "krishna", "krishna@gmail.com"));
        students.add(new StudentModel(3, "tejas", "tejas@gmail.com"));
        students.add(new StudentModel(4, "aditya", "aditya@gmail.com"));
        students.add(new StudentModel(5, "faguni", "faguni@gmail.com"));
        return students;
    }
}
