package com.chengge.service;

import com.chengge.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有的学员信息
     * @return
     */
    public List<Student> findAllStudent();

    /**
     * 查询单个学员信息
     * @param id
     * @return
     */
    public Student get(String id);
}
