package com.zlzhang.designpatterns.StatePatterns.WorkStateDemo;

/**
 * Created by zhilaizhang on 17/8/20.
 */

public class Client {
    public static void main(String[] args){
        IWork mProgramWork;

        mProgramWork = new ProgramWork();

        mProgramWork.setTime(9);
        mProgramWork.writeProgram();

        mProgramWork.setTime(12);
        mProgramWork.writeProgram();

        mProgramWork.setTime(15);
        mProgramWork.writeProgram();

        mProgramWork.setTime(18);
        mProgramWork.writeProgram();


        mProgramWork.setTime(21);
        mProgramWork.writeProgram();

        mProgramWork.setTime(23);
        mProgramWork.writeProgram();

    }
}
