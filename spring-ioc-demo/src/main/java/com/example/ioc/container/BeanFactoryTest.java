package com.example.ioc.container;

import com.example.ioc.container.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cyf
 * @description
 * @create 2020-04-16 13:49
 **/
public class BeanFactoryTest {

    public static void main(String[] args) {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("application-context.xml");

        User user = beanFactory.getBean("user", User.class);
        System.out.println("自己声明的 bean 实例 "+user);


    }

}
