package com.mybatis.service.serviceImpl;

import com.mybatis.dao.StudentDaoMapper;
import com.mybatis.domain.Student;
import com.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: ssm_1
 * @description:
 * @author: Mr.Wang
 * @create: 2019-03-19 22:32
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDaoMapper studentDaoMapper;
    @Override
    public List<Student> getALlStudent() {
        return studentDaoMapper.getAllStudent();
    }
}
