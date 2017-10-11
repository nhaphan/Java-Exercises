package ui;

public class TestPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1,2,1,8,9);
        MyPolynomial p2 = new MyPolynomial(4,5,6,8);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.multi(p2));


    }
}
