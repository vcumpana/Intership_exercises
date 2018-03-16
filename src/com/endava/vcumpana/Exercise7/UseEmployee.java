package com.endava.vcumpana.Exercise7;

public class UseEmployee {

    public static void main(String[] args) {

        Manager employee = new Manager(40);

        System.out.printf("Tariff per hour : %.2f\nSalary: %.2f", employee.getTariffPerHour(), employee.getSalary());
    }
}
