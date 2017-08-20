package com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.State;

import com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.IWork;

/**
 * Created by zhilaizhang on 17/8/20.
 */

public class NightWorkState implements IWorkState {
    @Override
    public void writeProgram(IWork work) {
        if (work.isWorkFinished()) {
            System.out.println("工作完成，回家");
        } else {
            if (work.getTime() < 23) {
                System.out.println("加班工作");
            } else {
                work.setState(new RestWorkState());
                work.writeProgram();
            }
        }
    }
}
