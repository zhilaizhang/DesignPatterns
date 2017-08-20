package com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.State;

import com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.IWork;

/**
 * Created by zhilaizhang on 17/8/20.
 */

public class RestWorkState implements IWorkState {
    @Override
    public void writeProgram(IWork work) {
        System.out.println("困了，回家睡觉，明天继续");
    }
}
