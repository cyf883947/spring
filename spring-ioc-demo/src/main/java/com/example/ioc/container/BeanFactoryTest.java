package com.example.ioc.container;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author cyf
 * @description
 * @create 2020-04-16 13:49
 **/
public class BeanFactoryTest {

    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(1000));


    public static void main(String[] args) {

//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("application-context.xml");
//
//        User user = beanFactory.getBean("user", User.class);
//        System.out.println("自己声明的 bean 实例 "+user);
//
//        ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("application-context.xml");
//
//        // 启动 IOC
//        applicationContext.refresh();
//
//        // 关闭IOC
//        applicationContext.close();

//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 100; i++) {
//            executor.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(200);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"  执行业务代码 ");
//                }
//            });
//        }
//        executor.shutdown();
//        while (!executor.isTerminated()){
//        }
//        System.out.println("耗时 = "+ (System.currentTimeMillis()-startTime)+"ms");


        int ncpus = Runtime.getRuntime().availableProcessors();
        System.out.println(ncpus);

    }













}
