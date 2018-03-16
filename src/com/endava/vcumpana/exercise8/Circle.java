package com.endava.vcumpana.exercise8;

public class Circle extends GraphicObject{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
