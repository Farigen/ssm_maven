package com.mybatis.controller;

import com.mybatis.domain.Student;
import com.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @program: ssm_1
 * @description: Controller of Student
 * @author: Mr.Wang
 * @create: 2019-03-19 22:00
 **/
@Controller
public class StudentController {

    /*@Resource(name = "studentServiceImpl")*/
    @Autowired
    private StudentService studentServiceImpl;

    @RequestMapping("/getStudent")
    public String getStudent(Map<String, Object> map){
        List<Student> students = studentServiceImpl.getALlStudent();
        map.put("allStudents" ,students);
        return "list";
    }
}
