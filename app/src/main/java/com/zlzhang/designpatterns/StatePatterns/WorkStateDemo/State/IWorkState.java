package com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.State;

import com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.IWork;

/**
 * Created by zhilaizhang on 17/8/20.
 */

public interface IWorkState {
    void writeProgram(IWork work);
}
