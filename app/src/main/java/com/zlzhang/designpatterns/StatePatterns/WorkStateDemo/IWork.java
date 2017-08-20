package com.zlzhang.designpatterns.StatePatterns.WorkStateDemo;

import com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.State.IWorkState;

/**
 * Created by zhilaizhang on 17/8/20.
 */

public interface IWork {

    void setState(IWorkState workState);

    void setTime(int time);

    int getTime();

    boolean isWorkFinished();

    void writeProgram();
}
