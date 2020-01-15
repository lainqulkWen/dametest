package com.example.demo.test;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Administrator
 * @create 2020-01-13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class jdbcTest {

    Logger logger = LoggerFactory.getLogger(jdbcTest.class);

    @Autowired
    StudentService studentService;

    @Test
    public void test(){
        logger.info("hello");
        logger.debug("wen");
        logger.error("yi");
        logger.trace("chuan");
        logger.warn("haha");
    }

    @Test
    public void test4(){
        Map<String , Object> map = new HashMap<>();
        map.put("name","haha");
        map.put("sex","op");
        Student student = studentService.queryStu(map);
        logger.info("student",student);
    }


    @Test
    public void test1(){
        Student s = new Student();
        s.setName("haha");
        s.setAge(34);
        s.setPhone("1221421");
        s.setSex("op");

        studentService.saveStudent(s);



    }

    @Test
    public void test2(){
        Student s = new Student();
        s.setId(46);
        s.setName("东方不败");
        s.setAge(34);
        s.setPhone("1221421");
        s.setSex("女");

        studentService.updateStu(s);

    }

    @Test
    public void test3(){
        studentService.removeStu(46);
    }
}
