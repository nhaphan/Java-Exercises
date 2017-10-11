package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {
    private double[] coeffs = new double[100];

    public MyPolynomial(double ... coeffs) {
        this.coeffs = coeffs;
    }


    private   int getDegree() {
        int degree = 0;
        for (int i = 0; i < coeffs.length; i++) {
            if (coeffs[i] != 0) {
                degree = i;
            }
        }
        return degree;
    }

    @Override
    public String toString() {
      if (getDegree() == 0)
          return "" + coeffs[0];
      if (getDegree() == 1)
          return  coeffs[1] + "x + " + coeffs[0];
      String s = coeffs[getDegree()] + "x^" + getDegree();
      for (int i = getDegree() - 1; i >= 0; i --) {
          if (coeffs[i] == 0)
              continue;
          else if (coeffs[i] > 0)
              s = s.concat(" + " + coeffs[i]);
          else if (coeffs[i] < 0)
              s = s.concat(" - " + (-coeffs[i]));
          if (i == 1)
              s = s.concat("x");
          else if (i > 1)
              s = s.concat("x^" + i);
      }
      return s;
    }

    public double evaluate(double x) {
        double value = coeffs[0];
        for (int i = 1; i <= getDegree(); i ++) {
          value += coeffs[i] * Math.pow(x,i);
        }
        return value;
    }
    public MyPolynomial add(MyPolynomial another) {

        MyPolynomial myPolynomial;
        if(this.coeffs.length < another.coeffs.length) {
            myPolynomial = another;
            for (int i = 0; i < this.coeffs.length; i++) {
                myPolynomial.coeffs[i] += this.coeffs[i];
            }
        }
        else {
            myPolynomial = this;
            for (int i = 0; i < another.coeffs.length; i++) {
                myPolynomial.coeffs[i] += another.coeffs[i];
            }
        }
        return myPolynomial;
    }
    
    public  MyPolynomial multi(MyPolynomial another) {
        MyPolynomial myPolynomial;
        if(this.coeffs.length < another.coeffs.length) {
            myPolynomial = another;
            for (int i = 0; i < this.coeffs.length; i++) {
                myPolynomial.coeffs[i] *= this.coeffs[i];
            }
        }
        else {
            myPolynomial = this;
            for (int i = 0; i < another.coeffs.length; i++) {
                myPolynomial.coeffs[i] *= another.coeffs[i];
            }
        }
        return myPolynomial;
    }
}
