/*
10.4: (The MyPoint class) Design a class named MyPoint to represent a point with
x- and y-coordinates. The class contains:
 ■ The data fields x and y that represent the coordinates with getter
methods.
 ■ A no-arg constructor that creates a point (0, 0).
 ■ A constructor that constructs a point with specified coordinates.
 ■ A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
 ■ A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
Draw the UML diagram for the class and then implement the class. Write a
test program that creates the two points (0, 0) and (10, 30.5) and displays the
distance between them.
*/

public class Problem4 {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10 , 30.5);
        System.out.println("The distance between p1 and p2 = " + p1.distance(p2));
    }
}
class MyPoint{
    private double x , y;
    public MyPoint(){
        x = y = 0;
    }
    public MyPoint(double xi , double yi){
        x = xi;
        y = yi;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(double x1 , double y1){
        return Math.sqrt(Math.pow(x1 - x , 2) + Math.pow(y1 - y , 2));
    }
    public double distance(MyPoint p){
        return Math.sqrt(Math.pow(p.getX() - x , 2) + Math.pow(p.getY() - y , 2));
    }
}
