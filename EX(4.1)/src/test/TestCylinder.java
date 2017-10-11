package test;

import cylinder.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();

        c1.setColor("green");
        c1.setRadius(5);

        c1 = new Cylinder();
        System.out.println("Cylinder:"
                + "radius = " + c1.getRadius()
                + " height = " + c1.getHeight()
                + " Area = "   + c1.getArea()
                + " Volume = " + c1.getVolume()
                + " Color = " + c1.getColor()
        );
     /*   System.out.println("-----------------------------");
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + "radius = " + c2.getRadius()
                + " height = " + c2.getHeight()
                + " Area = "   + c2.getArea()
                + " Volume = " + c2.getVolume()
                + " Color = " + c2.getColor()
        );
        System.out.println("-----------------------------");
        Cylinder c3 = new Cylinder(2.0,10.0);
        System.out.println("Cylinder:"
                + "radius = " + c3.getRadius()
                + " height = " + c3.getHeight()
                + " Area = "   + c3.getArea()
                + " Volume = " + c3.getVolume()
                + " Color = " + c3.getColor()
        );*/


    }
}
