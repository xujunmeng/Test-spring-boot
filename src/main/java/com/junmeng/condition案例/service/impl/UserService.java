package com.junmeng.condition案例.service.impl;

import com.junmeng.condition案例.dao.UserDAO;
import com.junmeng.condition案例.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author james
 * @date 2018/11/27
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void test() {
        userDAO.test();
    }

}
