package com.chengge.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;
import java.util.Date;

@Data//此注解可以生成getter setter方法
@ToString//此注解可以生成toString方法
@NoArgsConstructor//此注解是无参构造
public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
    private Date birthday;
    private String datasource;

}
