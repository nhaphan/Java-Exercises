package player;

import ball.Ball;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0F;
    }
    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z = zDisp;
    }

    public boolean near(Ball ball) {
        float xDiff = (float) Math.pow(ball.getX() - this.x,2);
        float yDiff = (float) Math.pow(ball.getY() - this.y,2);
        float zDiff = (float) Math.pow(ball.getX() - this.z,2);
        float distance = (float) Math.sqrt(xDiff + yDiff + zDiff);
        return distance < 8;
    }

    public void kick(Ball ball) {
        ball.setXYZ(10 + ball.getX(),10 + ball.getY(),10 + ball.getZ());
    }
}
