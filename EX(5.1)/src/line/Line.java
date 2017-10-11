package line;
import point.Point;
public class Line {
    private Point begin;
    private Point end;
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX,beginY);
        end = new Point(endX,endY);
    }
    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return  begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
        begin.setX(beginY);
    }

    public void setEndX(int endX) {
        begin.setX(endX);
    }
    public void setEndY(int endY) {
        begin.setY(endY);
    }

    public void setBeginXY(int beginX, int beginY) {
        begin.setXY(beginX,beginY);
    }





    public double getLength() {
        double xDiff_ = Math.pow(end.getX() - begin.getX(),2);
        double yDiff_ = Math.pow(end.getY() - begin.getY(),2);
        return Math.sqrt(xDiff_ + yDiff_);
    }
    public double getGradient() {
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();

        return Math.atan2(yDiff,xDiff);
    }
}
