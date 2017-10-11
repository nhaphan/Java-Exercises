package test;

import circle.Circle;
import rectangle.Rectangle;
import shape.Shape;
import square.Square;

public class TestSquare {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5,"red",false);
        System.out.println(s1);


        Circle c1 = (Circle) s1;
        System.out.println(c1);

        //Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0,2.0,"red",false);
        System.out.println(s3);
        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);

        Shape s4 = new Square(6.6);
        System.out.println(s4);

        Rectangle r2 = (Rectangle)s4;
        System.out.println(s4);

        Square square = new Square(5.5);
        System.out.println(square);
    }
}
