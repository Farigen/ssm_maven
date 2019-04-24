package com.mybatis.service.serviceImpl;

import com.mybatis.dao.StudentDaoMapper;
import com.mybatis.domain.Student;
import com.mybatis.service.StudentService;
import org.apache.ibatis.session.SqlSession;
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
    SqlSession sqlSession;      //用于批量操作
    @Autowired
    private StudentDaoMapper studentDaoMapper;      //用于基于接口的mapper操作
    @Override
    public List<Student> getALlStudent() {
        return studentDaoMapper.getAllStudent();
    }

    //批量操作示例
    public Long addStudentsByBatch(){
        StudentDaoMapper mapper = sqlSession.getMapper(StudentDaoMapper.class);
        Student student = new Student(5, "王五", 98, 89);
        return mapper.addStudent(student);
    }

    @Override
    public Long addStudent(Student student) {
        return studentDaoMapper.addStudent(student);
    }
}
