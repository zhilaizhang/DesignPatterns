package com.zlzhang.designpatterns.StatePatterns.WorkStateDemo;

import com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.State.ForenoonWorkState;
import com.zlzhang.designpatterns.StatePatterns.WorkStateDemo.State.IWorkState;

/**
 * Created by zhilaizhang on 17/8/20.
 */

public class ProgramWork implements IWork {

    private IWorkState mWorkState;
    private int mTime;
    private boolean isWorkFinished;

    public ProgramWork(){
        mWorkState = new ForenoonWorkState();
    }

    @Override
    public void setState(IWorkState workState) {
        mWorkState = workState;
    }

    public void setTime(int time){
        mTime = time;
    }

    @Override
    public int getTime() {
        return mTime;
    }

    public void  setWorkFinished(boolean workFinished){
        isWorkFinished = workFinished;
    }

    @Override
    public boolean isWorkFinished() {
        return isWorkFinished;
    }

    @Override
    public void writeProgram() {
        mWorkState.writeProgram(this);
    }
}
