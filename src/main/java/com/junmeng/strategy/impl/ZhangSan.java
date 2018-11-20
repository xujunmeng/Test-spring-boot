package com.junmeng.strategy.impl;

import com.junmeng.strategy.Fighter;

/**
 * @author james
 * @date 2018/11/18
 */
public class ZhangSan implements Fighter {

    @Override
    public void fight() {
        System.out.println("张三的漂漂拳");
    }
}
