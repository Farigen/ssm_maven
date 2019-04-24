package com.mybatis.service;

import com.mybatis.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> getALlStudent();
    Long addStudent(Student student);
}
