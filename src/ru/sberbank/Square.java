package ru.sberbank;

public class Square extends Figures {
    final double a;

    public Square(double a) {
        this.a = a;
    }

    public double area(){
        return (a*a);
    }
}
