package com.endava.vcumpana.exercise5;

public class UsePoint {
    public static void main(String[] args) {

        Point point1 = new Point(1 , 2, 3);
        System.out.printf("For point 1: x = %d, y = %d, z = %d\n", point1.getX(), point1.getY(), point1.getZ());

        Point point2 = new Point(4, 5);
        System.out.printf("For point 2: x = %d, y = %d, z = %d\n", point2.getX(), point2.getY(), point2.getZ());
    }
}
