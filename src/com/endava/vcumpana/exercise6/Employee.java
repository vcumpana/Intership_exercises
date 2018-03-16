package com.endava.vcumpana.exercise6;

public class Employee {

    private double tariffPerHour = 5.5;
    public int hours;

    public Employee(int hours){
        this.hours = hours;
    }

    public double getSalary(){
        return tariffPerHour*hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }
}
