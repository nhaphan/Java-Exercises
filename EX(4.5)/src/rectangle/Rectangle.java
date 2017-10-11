package rectangle;


import shape.Shape;

public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color,boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return (width+length)*2;
    }
    @Override
    public String toString() {
        return "A Rectangle with width=".
                concat(String.valueOf(width)).concat(" and length=").
                concat(String.valueOf(length)).concat(", which is a subclass of")
                .concat(super.toString());
    }
}
