package com.example.demo.service;

import com.example.demo.bean.Student;

import java.util.Map;

/**
 * @author Administrator
 * @create 2020-01-13
 */
public interface StudentService {
    public Student queryStudentById(Integer id);

    public void saveStudent(Student student);

    public void updateStu(Student student);

    public void removeStu(Integer id);

    public Student queryStu(Map<String,Object> map);
}
