package com.example.test;

import com.example.demo.bean.HelloMessage;
import org.apache.naming.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:config.xml");
        HelloMessage ms = (HelloMessage) ac.getBean("helloMessage");
        System.out.println(ac.getDisplayName());
        System.out.println(ms.getMsg());
    }
}
