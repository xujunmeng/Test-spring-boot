package com.junmeng.strategy.impl;

import com.junmeng.strategy.Fighter;

/**
 * @author james
 * @date 2018/11/18
 */
public class LiSi implements Fighter {

    @Override
    public void fight() {
        System.out.println("李四小飞刀");
    }
}
