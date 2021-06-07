package com.company;



public class Triangle implements Shape{
    private int base;
    private int height;
    private int hypotenuse;

    public Triangle(int base, int height, int hypotenuse){
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }


    @Override
    public void printArea() {
        System.out.println("Area: " + ((this.base*this.height)/2));
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter: " + (this.base + this.height + this.hypotenuse));
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }
}
