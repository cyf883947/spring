package com.example;

import com.example.ioc.container.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author YFC
 * @create 2020-04-22 下午 10:30
 */
public class BeanDefintionConstrorDemo {

    public static void main(String[] args) {

        // 通过 BeanDefinitionBuilder 来构建
        BeanDefinitionBuilder definitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
        // 通过属性设置
        definitionBuilder.addPropertyValue("name","cyf");
        definitionBuilder.addPropertyValue("age",28);
        BeanDefinition beanDefinition = definitionBuilder.getBeanDefinition();
        System.out.println(beanDefinition);

        GenericBeanDefinition genericBeanDefinition  = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(User.class);

        // 通过 MutablePropertyValues 定义bean 的元信息
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("name","cyf");
        propertyValues.addPropertyValue("age",28);
        genericBeanDefinition.setPropertyValues(propertyValues);
    }


}
