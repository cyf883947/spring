package com.example.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author cyf
 * @description
 * @create 2020-04-27 9:29
 **/
@Import(Conf.class)
public class RegisterBean {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        // 1. 通过java 注解的方式注册 bean 实例
        applicationContext.register(Conf.class);


        // 开启应用上下文
        applicationContext.refresh();

        // 依赖获取 user bean 实例
        User user = applicationContext.getBean(User.class);
        System.out.println("user = "+user);

        Conf conf = applicationContext.getBean(Conf.class);
        User user1 = conf.user();
        System.out.println("conf.user = "+user1);

        // 关闭应用上下文
        applicationContext.close();

        // 2. 通过@Component 注解

        // 3. 通过@Import 注解


    }








}
