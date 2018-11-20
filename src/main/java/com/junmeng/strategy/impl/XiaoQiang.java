package com.junmeng.strategy.impl;

import com.junmeng.strategy.Fighter;

/**
 * @author james
 * @date 2018/11/18
 */
public class XiaoQiang {

    private Fighter fighter;

    public XiaoQiang(Fighter fighter) {
        this.fighter = fighter;
    }

    public void fight() {
        System.out.println("小明开始挑战...");
        fighter.fight();
    }

}
