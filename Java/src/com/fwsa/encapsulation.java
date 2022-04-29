package com.fwsa;

import com.fwsa.riyas.*;

class userdata {
    private int acNumber;
    private String password;
    public int getAccountNumber() {
        return acNumber;
    }
    public void setAccountNumber(int acNumber) {
        this.acNumber = acNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
public class encapsulation {
    public int a=10;
    public static void main(String[] args) {
        userdata myObj = new userdata();
        myObj.setAccountNumber(23);
        myObj.setPassword("riyasy7368y0");
        System.out.println("Account number is "+myObj.getAccountNumber() +" "+"Password is "+ myObj.getPassword());
        System.out.println();
    }
}
