package square;

import rectangle.Rectangle;

public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    @Override
    public String toString() {
        return "A Square with side=".concat(String.valueOf(super.getWidth()))
                .concat(" which is a subclass of ").concat(super.toString());
    }
}
