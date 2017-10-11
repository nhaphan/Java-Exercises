package test;

import point.MyPoint;

import java.util.Arrays;


public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(1,2);
        MyPoint myPoint2 = new MyPoint(2,3);
        System.out.println(myPoint1.distance(myPoint2));
    }
}
