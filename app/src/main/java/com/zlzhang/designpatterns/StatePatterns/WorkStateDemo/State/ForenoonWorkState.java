package com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.State;

import com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.IWork;

/**
 * Created by zhilaizhang on 17/8/20.
 */

public class ForenoonWorkState implements IWorkState {
    @Override
    public void writeProgram(IWork work) {
        if(work.getTime() < 12){
            System.out.println("工作状态不错哦");
        } else {
            work.setState(new NoonWorkState());
            work.writeProgram();
        }
    }
}
