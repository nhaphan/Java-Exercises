package shape;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled ) {
        this.color  = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String filled_;
        if (isFilled()) filled_ = "filled";
        else filled_ = "not filled";
        return " A shape with color of ".concat(color .concat(" and ".concat(filled_)));
    }
}
