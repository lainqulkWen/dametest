package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @create 2020-01-13
 */

@Controller
public class HollerController {

    @Autowired
    StudentService studentService;

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hello word";
    }

    @ResponseBody
    @RequestMapping("test")
    public Student test(){
        Student student = studentService.queryStudentById(20);

        return student;
    }
}


