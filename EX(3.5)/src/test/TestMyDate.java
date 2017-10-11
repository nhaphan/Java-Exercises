package test;

import date.MyDate;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2016, 2, 29);
        System.out.println(myDate.nextDay());
    }
}
