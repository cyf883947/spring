package com.example.instatiation;

import com.example.factory.DefaultUserFactory;
import com.example.factory.UserFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.ServiceLoader;

import static java.util.ServiceLoader.load;

/**
 * @author YFC
 * @create 2020-04-27 下午 10:45
 */
public class AnnotationBeanDefinitionDemo {

    public static void main(String[] args) {

        // 传统方式注册bean

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-instatition-context.xml");
        // 通过静态工厂导入
        //User user = applicationContext.getBean("user-by-static-method", User.class);
        //System.out.println(user);
        //
        //// 通过工厂方式
        //User user1 = applicationContext.getBean("user-by-static-factory", User.class);
        //System.out.println(user1);
        //
        //System.out.println(user == user1);
        //
        //// 通过 factory bean 注册
        //User user2 = applicationContext.getBean("user-factory-bean", User.class);
        //System.out.println(user2);


        /**
         *  特殊注册的方式
         *
         */
        applicationContext = new ClassPathXmlApplicationContext("special-application-instatition-context.xml");



        // 通过注册 serviceLoaderFactoryBean 来获取实例
        ServiceLoader serviceLoader = applicationContext.getBean("serviceLoader", ServiceLoader.class);
        displayServiceLoader(serviceLoader);

        // serviceLoader
        demoServiceLoader();

        // 通过 AutowireCapableBeanFactory 获取实例
        AutowireCapableBeanFactory beanFactory = applicationContext.getAutowireCapableBeanFactory();

        // 尽量用具体实例来创建，否则下边这行抛出异常  Specified class is an interface
        //UserFactory userFactory = beanFactory.createBean(UserFactory.class);
        UserFactory userFactory = beanFactory.createBean(DefaultUserFactory.class);
        User user = userFactory.createUser();
        System.out.println(user);
    }


    public static void demoServiceLoader(){
        // 可以使用静态导入
        ServiceLoader<UserFactory> serviceLoader = load(UserFactory.class, Thread.currentThread().getContextClassLoader());
        displayServiceLoader(serviceLoader);
    }

    public static void displayServiceLoader(ServiceLoader serviceLoader){
        Iterator<UserFactory> iterator = serviceLoader.iterator();
        while (iterator.hasNext()){
            UserFactory userFactory = iterator.next();
            System.out.println(userFactory.createUser());
        }
    }


}
