package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 * @create 2020-01-15
 */

@Controller
public class FileController {


    @RequestMapping("/file")
    public String file(){
        return "file";
    }

    @RequestMapping("/fileupload")
    public void fileupload(MultipartFile file, HttpServletRequest request){

        if(file.isEmpty()){
            System.out.println("空空如也");
        }
    }
}
