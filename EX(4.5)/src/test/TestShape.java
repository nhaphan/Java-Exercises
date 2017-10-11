package test;

import shape.Shape;
import square.Square;

public class TestShape {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(5);
        square.setLength(5);
        System.out.println(square.getArea());
    }
}
