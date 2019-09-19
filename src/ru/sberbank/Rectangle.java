package ru.sberbank;

public class Rectangle extends Figures {
    final double a;
    final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return (a*b);
    }
}
