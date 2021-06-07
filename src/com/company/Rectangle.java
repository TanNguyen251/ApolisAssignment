package com.company;

public class Rectangle implements Shape{
    private int length;
    private int height;

    public Rectangle (int length, int height){
        this.length = length;
        this.height = height;
    }
    @Override
    public void printArea() {
        System.out.println("Area: " + (this.length*this.height));
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter: " + (2*(this.length*this.height)));
    }

    public int area(){
        return this.length*this.height;
    }
}
