package ru.sberbank;

public class Circle extends Figures {
    final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return (Math.PI*(Math.pow(this.r,2.0)));
    }
}
