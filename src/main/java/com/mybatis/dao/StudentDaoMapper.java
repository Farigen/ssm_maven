package com.mybatis.dao;

import com.mybatis.domain.Student;

import java.util.List;

public interface StudentDaoMapper {
    List<Student> getAllStudent();
    Long addStudent(Student student);
}
