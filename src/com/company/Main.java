package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student("John", 2);
        System.out.println("Student name: " + student1.getName() + " Student roll number: " + student1.getRoll_no());

        Student student2 = new Student("Sam", 1);

        student1.setAddress("2354 Main st, Sacramento 95768");
        student2.setPhone_number("9163824075");
    }
}
