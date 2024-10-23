package com.example.Basic_Student_Management_System;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
/*
Annotations in Spring are a powerful feature that simplifies the configuration and development process.
They provide metadata about the code and allow developers to define behaviors, configurations, and
dependencies more easily. In Spring, annotations help reduce boilerplate code by allowing
the framework to handle much of the configuration automatically.
 */
public class StudentController {
    HashMap<Integer,Student> hashMap = new HashMap<>();
    @PostMapping("/registerStudent") //addStudent is a end point and postMapping is anotation use to add info into Database
    public void addStudent(@RequestBody Student student){
        int key = student.getRollNo();
        hashMap.put(key,student);

    }

    @GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam("rollNo")Integer rollNo){
        Student student =hashMap.get(rollNo);
        return student ;

    }
}
