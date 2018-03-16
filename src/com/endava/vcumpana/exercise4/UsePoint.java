package com.endava.vcumpana.exercise4;

public class UsePoint {
    public static void main(String[] args) {

        Point point = new Point();
        point.setX(1);
        point.setY(2);
        point.setZ(3);

        System.out.printf("x = %d, y = %d, z = %d", point.getX(), point.getY(), point.getZ());
    }
}
