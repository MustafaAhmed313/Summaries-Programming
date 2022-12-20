/*
13.1: (Triangle class) Design a new Triangle class that extends the abstract
GeometricObject class. Draw the UML diagram for the classes Triangle
and GeometricObject and then implement the Triangle class. Write a test
program that prompts the user to enter three sides of the triangle, a color, and a
Boolean value to indicate whether the triangle is filled. The program should create
a Triangle object with these sides and set the color and filled properties using
the input. The program should display the area, perimeter, color, and true or false
to indicate whether it is filled or not.
*/

import java.util.Objects;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the following inputs ( side1 , side2 , side3 , color , filled ):");
        double side1 = input.nextDouble() , side2 = input.nextDouble() , side3 = input.nextDouble();
        String color = input.next();
        boolean filled = input.nextBoolean();
        Triangle t = new Triangle(side1 , side2 , side3 , color , filled);
        System.out.printf("""
                Triangle 1:-
                ------------
                Perimeter: %2.3f
                Area: %2.3f
                color: %s
                filled: %b
                """
                , t.getPerimeter() , t.getArea() , t.getColor() , t.isFilled());
    }
}
abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color;
    private boolean filled;

    public GeometricObject() {

    }
    public GeometricObject(String color , boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public int compareTo(GeometricObject obj) {
        if (Objects.equals(max(this, obj), this)) return 1;
        else if (Objects.equals(max(this, obj), obj)) return -1;
        else return 0;
    }

    public static GeometricObject max(GeometricObject obj1 , GeometricObject obj2){
        if (obj1.getArea() > obj2.getArea()) return obj1;
        else if(obj1.getArea() < obj2.getArea()) return obj2;
        else return null;
    }

    public void howToColor() {
    }
}

class Triangle extends GeometricObject {
    private double side1 , side2 , side3;
    public Triangle(double side1 , double side2 , double side3 , String color , boolean filled) {
        super(color , filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public double getArea() {
        return 0.5 * (side1 * side2);
    }
}