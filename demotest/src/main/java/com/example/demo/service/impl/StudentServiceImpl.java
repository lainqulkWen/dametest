package com.example.demo.service.impl;

import com.example.demo.bean.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Administrator
 * @create 2020-01-13
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    public StudentServiceImpl() {
    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public void saveStudent(Student student) {
        studentMapper.insertStudent(student);
    }

    @Override
    public void updateStu(Student student) {
        studentMapper.updateStudentById(student);
    }

    @Override
    public void removeStu(Integer id) {
        studentMapper.deleteStudent(id);
    }

    @Override
    public Student queryStu(Map<String, Object> map) {
        return studentMapper.selectStuByNameAndSex(map);
    }
}
