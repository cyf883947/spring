package com.example.factory;

import com.example.instatiation.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author YFC
 * @create 2020-04-27 下午 10:55
 */
public class UserFactoryBean  implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return User.createUser();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
