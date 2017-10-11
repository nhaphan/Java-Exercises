package circle;

public class Circle {
    private double radius ;
    private String color;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() { //contructor day ne ma keu khong co
        color = "red";
        radius = 1.0;
    }

    public Circle(double radius) { // day nua ne
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
