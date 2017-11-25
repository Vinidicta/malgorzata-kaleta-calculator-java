package com.kodilla;

public class Calculator {
    double a, b, c, d;

    public Calculator(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double add() {
        return this.a + this.b;
    }

    public double subtract() {
        return this.c - this.d;
        }
}
