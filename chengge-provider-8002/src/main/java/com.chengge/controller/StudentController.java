package com.chengge.controller;

import com.chengge.entity.Student;
import com.chengge.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//相当于@Controller和每个方法上面的@ResponseBody
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("chengge-provider");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }


    /**
     * 查询所有学生信息
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Student> findAllStudent() {
        return studentService.findAllStudent();
    }

    /**
     * 查询单个学员信息
     * PathVariable注解可以获得请求链接中的参数，比如  get/1   参数获得的就是 1
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Student get(@PathVariable("id") String id) {
        return studentService.get(id);
    }
}
