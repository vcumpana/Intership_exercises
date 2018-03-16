package com.endava.vcumpana.exercise6;

public class UseEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee(40);

        System.out.printf("Tariff per hour : %.2f\nSalary: %.2f", employee.getTariffPerHour(), employee.getSalary());
    }
}
