package com.company;

public class Student {
    private String name;
    private int roll_no;
    private String address;
    private String phone_number;
    public Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
        this.address = "";
        this. phone_number = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void printInfo(){
        System.out.println("Student name: " + this.name + "\nStudent roll number: " + this.roll_no + "\nStudent address: " + this.address +"\nStudent Phone number: " + this.phone_number);
    }
}
