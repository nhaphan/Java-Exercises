package mycomplex;

public class TestMycomplex {
    public static void main(String[] args) {
        MyComplex myComplex = new MyComplex(5,6);
        MyComplex myComplex1 = new MyComplex(3,4);
        MyComplex myComplex2 = new MyComplex(1,2);

        System.out.println(myComplex.equals(myComplex1));
    }
}
