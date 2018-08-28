package com.chengge.service.impl;

import com.chengge.dao.StudentDao;
import com.chengge.entity.Student;
import com.chengge.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAllStudent() {
        return studentDao.selectAllStudent();
    }

    @Override
    public Student get(String id) {
        return studentDao.selectOneById(id);
    }
}
