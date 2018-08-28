package com.chengge.controller;

import com.chengge.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("client")
public class ChenggeClient_80 {

    //    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://chengge-provider";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/student/all")
    public List<Student> findStudentAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/all", List.class);
    }

    @RequestMapping(value = "/student/get/{id}")
    public Student get(@PathVariable("id") String id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/get/" + id, Student.class);
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/student/discovery", Object.class);
    }

}
