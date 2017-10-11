package test;

import time.MyTime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(0,0,0);
        System.out.println(myTime.previousSecond());
    }
}
