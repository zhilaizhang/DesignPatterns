package com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.State;

import com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.IWork;

/**
 * Created by zhilaizhang on 17/8/20.
 */

public class AfternoonWorkState implements IWorkState {
    @Override
    public void writeProgram(IWork work) {
        if (work.getTime() < 18) {
            System.out.println("工作状态变好");
        } else {
            work.setState(new NightWorkState());
            work.writeProgram();
        }
    }
}
