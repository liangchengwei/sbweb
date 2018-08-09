package com.example.demo;

import com.example.demo.bean.HelloMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:config.xml");
        HelloMessage ms = (HelloMessage) ac.getBean("helloMessage");
        System.out.println(ms.getMsg());

    }


    public static void main(String args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("config.xml");
        HelloMessage ms = (HelloMessage) ac.getBean("helloMessage");
        System.out.print(ms.getMsg());
    }



}
