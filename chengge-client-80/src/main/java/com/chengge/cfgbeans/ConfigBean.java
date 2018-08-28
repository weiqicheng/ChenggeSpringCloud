package com.chengge.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{

//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">

    /**
     * 声明RestTemplate  提供非常简单的RESTful方式与http server端进行数据交互，根据所提动的URLs进行http访问，并处理返回结果。
     * @return
     */
    @Bean
    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

