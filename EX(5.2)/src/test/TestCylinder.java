package test;

import circle.Circle;
import cylinder.Cylinder;

/**
 * Created by kalipts on 26/09/2017.
 */
public class TestCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder(circle,10);
        System.out.println(cylinder);
    }
}
