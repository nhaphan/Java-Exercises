package container;

import ball.Ball;

/**
 * Created by kalipts on 07/10/2017.
 */
public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x,int y, int width, int height) {

    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public boolean collides(Ball ball) {
        if (ball.getX()-ball.getRadius() <= this.x1 ||
                ball.getX() -ball.getRadius() >= this.x2) {
            ball.reflecHorizontal();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
