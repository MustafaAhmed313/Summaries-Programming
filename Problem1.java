/*
11.1: (The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
 ■ Three double data fields named side1, side2, and side3 with default
values 1.0 to denote three sides of the triangle.
 ■ A no-arg constructor that creates a default triangle.
 ■ A constructor that creates a triangle with the specified side1, side2, and
side3.
 ■ The accessor methods for all three data fields.
 ■ A method named getArea() that returns the area of this triangle.
 ■ A method named getPerimeter() that returns the perimeter of this triangle.
 ■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not.
a for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area = root :s(s - side1)(s - side2)(s - side3)
*/
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter a color: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ")
                + "filled");
    }
}
class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
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
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}
class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    Triangle() {
        side1 = side2 = side3 = 1.0;
    }
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}

