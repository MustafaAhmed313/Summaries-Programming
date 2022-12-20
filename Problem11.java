/*
13.11: (The Octagon class) Write a class named Octagon that extends
GeometricObject and implements the Comparable and Cloneable interfaces.
Assume that all eight sides of the octagon are of equal length. The area can
be computed using the following formula:
area = (2 + 4/root2)* side * side
 Draw the UML diagram that involves Octagon, GeometricObject,
Comparable, and Cloneable. Write a test program that creates an Octagon
object with side value 5 and displays its area and perimeter. Create a new object
using the clone method and compare the two objects using the compareTo
method.
*/


public class Problem11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon o1 = new Octagon("blue" , true , 5);
        System.out.printf("""
                Octagon 1:-
                Area = %2.2f
                Perimeter = %2.2f
                """ , o1.getArea() , o1.getPerimeter());
        Octagon o2 =  o1.clone();
        System.out.println("is Octagon 1 equals Octagon 2? " + ((o1.compareTo(o2) == 0)? "Yes":"No"));
    }
}

class Octagon extends GeometricObject implements Comparable<GeometricObject> , Cloneable {
    private double side;

    public Octagon() {

    }

    public Octagon(String color , boolean filled , double side) {
        super(color, filled);
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
        return 8 * side;
    }

    @Override
    public double getArea() {
        return (2 + 4/Math.sqrt(2)) * side * side;
    }

    @Override
    public Octagon clone() throws CloneNotSupportedException {
        return (Octagon)super.clone();
    }

    @Override
    public int compareTo(GeometricObject obj) {
        return super.compareTo(obj);
    }
}
