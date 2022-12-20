/*
13.7: (The Colorable interface) Design an interface named Colorable with a void
method named howToColor(). Every class of a colorable object must implement the Colorable interface.
Design a class named Square that extends
GeometricObject and implements Colorable. Implement howToColor to
display the message Color all four sides.
 Draw a UML diagram that involves Colorable, Square, and GeometricObject.
Write a test program that creates an array of five GeometricObjects. For each
object in the array, display its area and invoke its howToColor method if it is
colorable.
*/

public class Problem7 {
    public static void main(String[] args){
        GeometricObject[] Gobj = new GeometricObject[5];
        Gobj[0] = new Square(10 , "orange" , true);
        Gobj[1] = new Square(11 , "red" , true);
        Gobj[2] = new Square(12 , "yellow" , true);
        Gobj[3] = new Square(13 , "green" , true);
        Gobj[4] = new Square(14 , "lightblue" , true);
        for (GeometricObject o : Gobj) {
            System.out.println("Area = " + o.getArea());
            o.howToColor();
            System.out.println();
        }
    }
}
interface Colorable {
    void howToColor();
}

class Square extends GeometricObject implements Colorable {
    private double side;
    public Square() {
        this.side = 1;
    }
    public Square(double side , String color , boolean filled) {
        super(color , filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
    @Override
    public double getArea() {
        return this.side * this.side;
    }
    @Override
    public void howToColor() {
        System.out.println("all four sides are " + this.getColor());
    }
}
