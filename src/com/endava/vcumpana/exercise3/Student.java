package com.endava.vcumpana.exercise3;

public class Student {

    private String name;
    private int age;

    void setData (String n, int a)
    {
        name = n;
        age = a;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setData("John", 30);
        student2.setData("Nick", 24);
        int average = (student1.getAge() + student2.getAge()) / 2;
        System.out.printf("The average age of two students is %d", average);
    }

}
