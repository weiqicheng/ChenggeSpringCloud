package com.chengge.dao;

import com.chengge.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentDao {
    /**
     * 注意此处的Student是common-8002公共模块定义的
     */
    public List<Student> selectAllStudent();

    public Student selectOneById(@Param("id") String id);
}
