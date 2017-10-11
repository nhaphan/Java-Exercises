package test;
import linesub.LineSub;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub1 = new LineSub(0,0,3,4);
        System.out.println(lineSub1.getLength());
        System.out.println(lineSub1.getGradient());
        System.out.println(lineSub1);
    }
}
