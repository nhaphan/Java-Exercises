package mycomplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(){
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }
    public boolean isReal() {
        return (imag == 0);
    }
    public boolean isImag() {
        return (real == 0);
    }
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex myComplex) {
        return this.real == myComplex.real && this.imag == imag;
    }

    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }

    public double argumentInradians() {
        return Math.atan2(imag,real);
    }
    public int argumentIndegrees() {
        return (int) ((Math.atan2(imag,real) * 180 )/ Math.PI);
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    public MyComplex add(MyComplex myComplex) {

        myComplex.real = this.real + myComplex.real;
        myComplex.imag = this.imag + myComplex.imag;
        return  myComplex;
    }

    public MyComplex subtract(MyComplex myComplex) {
        myComplex.real = this.real - myComplex.real;
        myComplex.imag = this.imag - myComplex.imag;
        return myComplex;
    }

    public MyComplex multiplyWith(MyComplex myComplex) {
        MyComplex complex = new MyComplex();
        complex.real = this.real*myComplex.real - this.imag*myComplex.imag;
        complex.imag = this.real*myComplex.imag + this.imag*myComplex.real;
        return complex;
    }

    public MyComplex DivideBy(MyComplex myComplex) {
        MyComplex complex;
        complex = this.multiplyWith(myComplex.conjugate());
        complex.real /= myComplex.real*myComplex.real+myComplex.imag*myComplex.imag;
        complex.imag /= myComplex.real*myComplex.real+myComplex.imag*myComplex.imag;
        return complex;
    }


}
