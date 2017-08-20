package com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.State;

import com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.IWork;

/**
 * Created by zhilaizhang on 17/8/20.
 */

public class NoonWorkState implements IWorkState {
    @Override
    public void writeProgram(IWork work) {
        if (work.getTime() < 13) {
            System.out.println("有点困，想睡觉");
        } else {
            work.setState(new AfternoonWorkState());
            work.writeProgram();
        }
    }
}
