package cylinder;

import circle.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
        height = 1.0;
    }


    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

    @Override
    public double getArea() {
        super.getArea();
        return 2 * Math.PI * super.getRadius() * this.height + 2 * super.getArea();
    }
}
