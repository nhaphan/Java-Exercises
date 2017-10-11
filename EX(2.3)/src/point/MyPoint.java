package point;


public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {x,y};
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y) {
        double diffOfX = (x - this.x)*(x - this.x);
        double diffOfY = (y - this.y)*(y - this.y);
        return Math.sqrt(diffOfX + diffOfY);
    }
    public double distance(MyPoint another) {
        double diffOfX = (another.getX() - this.x)*(another.getX() - this.x);
        double diffOfY = (another.getY() - this.y)*(another.getY() - this.y);
        return Math.sqrt(diffOfX + diffOfY);
    }
    public double distance() {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
