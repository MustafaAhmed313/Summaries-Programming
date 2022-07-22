/*
9.9: (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides
have the same length and all angles have the same degree (i.e., the polygon is
both equilateral and equiangular). Design a class named RegularPolygon that
contains:
 ■ A private int data field named n that defines the number of sides in the polygon with default value 3.
 ■ A private double data field named side that stores the length of the side with
default value 1.
 ■ A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
 ■ A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
 ■ A no-arg constructor that creates a regular polygon with default values.
 ■ A constructor that creates a regular polygon with the specified number of sides
and length of side, centered at (0, 0).
 ■ A constructor that creates a regular polygon with the specified number of sides,
length of side, and x- and y-coordinates.
 ■ The accessor and mutator methods for all data fields.
 ■ The method getPerimeter() that returns the perimeter of the polygon.
 ■ The method getArea() that returns the area of the polygon. The formula for
computing the area of a regular polygon is Area = (n * s^2) /(4 * tan(pi/n)).
Draw the UML diagram for the class and then implement the class. Write a test
program that creates three RegularPolygon objects, created using the no-arg
constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
4, 5.6, 7.8). For each object, display its perimeter and area.
*/

public class Problem9 {
    public static void main(String[] args){
        RegularPolygon Rp1 = new RegularPolygon();
        RegularPolygon Rp2 = new RegularPolygon(6 ,4);
        RegularPolygon Rp3 = new RegularPolygon(10 , 4 , 5.6 , 7.8);
        System.out.printf("""
                        Regular Polygon 1 : -
                        Perimeter = %2.2f m
                        Area = %2.2f m^2
                        Regular Polygon 2 : -
                        Perimeter = %2.2f m
                        Area = %2.2f m^2
                        Regular Polygon 3 : -
                        Perimeter = %2.2f m
                        Area = %2.2f m^2
                        """,
        Rp1.getPerimeter() , Rp1.getArea() , Rp2.getPerimeter() , Rp2.getArea() , Rp3.getPerimeter() , Rp3.getArea());
    }
}
class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    public RegularPolygon(){
    }
    public RegularPolygon(int sidesNumber , double newSide){
        n = sidesNumber;
        side = newSide;
    }
    public RegularPolygon(int sidesNumber , double newSide , double x1 , double y1){
        n = sidesNumber;
        side = newSide;
        x = x1;
        y = y1;
    }
    public void setN(int newNumber){
        n = newNumber;
    }
    public void setSide(double newSide){
        side = newSide;
    }
    public void setX(double x1){
        x = x1;
    }
    public void setY(double y1){
        y = y1;
    }
    public int getN(){
        return n;
    }
    public double getSide(){
        return side;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getPerimeter(){
        return side * n;
    }
    public double getArea(){
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
