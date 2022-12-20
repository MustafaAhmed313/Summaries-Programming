/*
13.5: (Enable GeometricObject comparable) Modify the GeometricObject class
to implement the Comparable interface, and define a static max method in the
GeometricObject class for finding the larger of two GeometricObject objects.
Draw the UML diagram and implement the new GeometricObject class. Write
a test program that uses the max method to find the larger of two circles and the
larger of two rectangles.
*/

public class Porblem5 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10 , "blue" , true);
        Circle c2 = new Circle(5 , "green" , false);
        System.out.println(c1.compareTo(c2));
        Rectangle r1 = new Rectangle(4 , 6 , "blue" , true);
        Rectangle r2 = new Rectangle(3 , 10 , "green" , false);
        System.out.println(r1.compareTo(r2));
        Rectangle r3 = new Rectangle(4 , 6 , "blue" , true);
        Rectangle r4 = new Rectangle(4 , 6 , "green" , false);
        System.out.println(r3.compareTo(r4));
    }
}
class Circle extends GeometricObject implements Comparable<GeometricObject> {
    private double radius;
    public Circle() {
        this.radius = 1;
    }
    public Circle(double radius , String color , boolean filled) {
        super(color , filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public boolean equals(Object obj) {
        Circle c1 = (Circle) obj;
        return this.radius == c1.getRadius();
    }
}

class Rectangle extends GeometricObject {
    private double width , height;
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }
    public Rectangle(double width , double height , String color , boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    @Override
    public double getArea() {
        return this.height * this.width;
    }

    public boolean equals(Object obj) {
        Rectangle r1 = (Rectangle) obj;
        return this.getArea() == r1.getArea();
    }

}

