package com.example.yzn.entity;

public class RegisterResult {

    public static final int ERROR=0;
    public static final int SUCCESS=1;
    public static final int FAIL=2;
    private int state;
    //private String clientpk;

    public RegisterResult(int state){
        this.state=state;
        //this.clientpk=clientpk;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    /*
    public String getClientpk() {
        return clientpk;
    }

    public void setClientpk(String clientpk) {
        this.clientpk = clientpk;
    }

     */
}
