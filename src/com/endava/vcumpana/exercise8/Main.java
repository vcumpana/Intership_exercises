package com.endava.vcumpana.exercise8;

public class Main {

    public static void main(String[] args) {
        GraphicObject circle = new Circle(7);
        GraphicObject square = new Square(7);
        System.out.printf("Circle area = %.2f\n", circle.area());
        System.out.printf("Square area = %.2f\n", square.area());
    }
}
