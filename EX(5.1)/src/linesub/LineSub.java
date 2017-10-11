package linesub;


import line.Line;
import point.Point;

import java.nio.channels.Pipe;

public class LineSub extends Point{

    private Point end;
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX,beginY);
        this.end = new Point(endX,endY);
    }
    public LineSub (Point begin, Point end) {
        super(begin.getX(),begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + super.toString() +
                ", end=" + end +
                '}';
    }
    public int getBeginX() {
       return super.getX();
    }
    public int getBeginY() {
        return super.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX(int beginX) {
        super.setX(beginX);
    }
    public void setBeginY(int beginY) {
        super.setY(beginY);
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }
    public double getLength() {
        double xDiff_ = Math.pow(end.getX() - super.getX(),2);
        double yDiff_ = Math.pow(end.getY() - super.getY(),2);
        return Math.sqrt(xDiff_ + yDiff_);
    }
    public double getGradient() {
        double xDiff = end.getX() - super.getX();
        double yDiff = end.getY() - super.getY();
        return Math.atan2(yDiff,xDiff);
    }
}
