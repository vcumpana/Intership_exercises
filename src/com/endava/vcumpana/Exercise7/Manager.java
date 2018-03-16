package com.endava.vcumpana.Exercise7;

public class Manager extends Employee {

    public Manager(int hours){
        super(hours);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.5;
    }
}
