package com.junmeng.condition案例.dao.impl;

import com.junmeng.condition案例.dao.UserDAO;
import org.springframework.stereotype.Component;

/**
 * @author james
 * @date 2018/11/27
 */
public class MongoUserDAO implements UserDAO {

    @Override
    public void test() {
        System.out.println("MongoUserDAO.test....");
    }

}
