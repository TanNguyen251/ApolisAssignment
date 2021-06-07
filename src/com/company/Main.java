package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student("John", 2);
        System.out.println("Student name: " + student1.getName() + " Student roll number: " + student1.getRoll_no());

        Student student2 = new Student("Sam", 1);

        student1.setAddress("2354 Main st, Sacramento 95768");
        student1.setPhone_number("9163824075");

        student2.setAddress("1728 55th st, Sacramento 95623");
        student2.setPhone_number("5103547396");

        student1.printInfo();
        student2.printInfo();

        Triangle triangle1 = new Triangle(3,4,5);
        triangle1.printArea();
        triangle1.printPerimeter();
    }
}
