package com.example.demo.mapper;

import com.example.demo.bean.Student;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Administrator
 * @create 2020-01-13
 */
@Component
public interface StudentMapper {
    public Student selectStudentById(Integer id);

    public void insertStudent(Student student);

    public void updateStudentById(Student student);

    public void deleteStudent(Integer id);

    public Student selectStuByNameAndSex(Map<String ,Object> map);
}
