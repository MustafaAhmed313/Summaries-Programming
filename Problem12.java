/*
10.12:  (Geometry: the Triangle2D class) Define the Triangle2D class that contains:
 ■ Three points named p1, p2, and p3 of the type MyPoint with getter and
setter methods. MyPoint is defined in Programming Exercise 10.4.
 ■ A no-arg constructor that creates a default triangle with the points (0, 0), (1,
1), and (2, 5).
 ■ A constructor that creates a triangle with the specified points.
 ■ A method getArea() that returns the area of the triangle.
 ■ A method getPerimeter() that returns the perimeter of the triangle.
 ■ A method contains(MyPoint p) that returns true if the specified point
p is inside this triangle (see Figure 10.22a).
■ A method contains(Triangle2D t) that returns true if the specified
triangle is inside this triangle (see Figure 10.22b).
 ■ A method overlaps(Triangle2D t) that returns true if the specified
triangle overlaps with this triangle (see Figure 10.22c).
Draw the UML diagram for the class and then implement the class. Write
a test program that creates a Triangle2D objects t1 using the constructor
new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
new MyPoint(5, 3.5)), displays its area and perimeter, and displays the
result of t1.contains(3, 3), r1.contains(new Triangle2D(new
MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and t1.
overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4,
-3), MyPoint(2, 6.5))).
(Hint: For the formula to compute the area of a triangle, see Programming Exercise 2.19.
To detect whether a point is inside a triangle, draw three dashed lines,
as shown in Figure  10.23. If the point is inside a triangle, each dashed line
should intersect a side only once. If a dashed line intersects a side twice, then
the point must be outside the triangle. For the algorithm of finding the intersecting point of two lines,
see Programming Exercise 3.25.)
*/

import java.awt.geom.Line2D;
public class Problem12 {
    public static void main(String[] args){
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.printf("""
                Triangle2D object1:-
                The area = %2.3f
                The perimeter = %2.3f
                t1 contains (3,3): %b
                t1 contains t2 : %b
                t1 overlaps t3 : %b
                """ ,
                t1.getArea() , t1.getPerimeter() , t1.contains(new MyPoint(3,3)) ,
                t1.contains
                (new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))),
                t1.overlaps
                (new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3),new MyPoint(2, 6.5))));
    }
}
class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;
    public Triangle2D(){
        p1 = new MyPoint(0,0);
        p2 = new MyPoint(1,1);
        p3 = new MyPoint(2,5);
    }
    public Triangle2D(MyPoint p1 , MyPoint p2 , MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public MyPoint getP1() {
        return p1;
    }
    public MyPoint getP2() {
        return p2;
    }
    public MyPoint getP3() {
        return p3;
    }
    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }
    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }
    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
    public double getArea(){
        return 0.5 * (p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY())
                + p3.getX() * (p1.getY() - p2.getY()));
    }
    public double getPerimeter(){
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }
    public boolean contains(MyPoint pi){
        double area = (0.5 * (pi.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - pi.getY())
                + p3.getX() * (pi.getY() - p2.getY()))) +
                0.5 * (p1.getX() * (pi.getY() - p3.getY()) + pi.getX() * (p3.getY() - p1.getY())
                + p3.getX() * (p1.getY() - pi.getY())) +
                0.5 * (p1.getX() * (p2.getY() - pi.getY()) + p2.getX() * (pi.getY() - p1.getY())
                + pi.getX() * (p1.getY() - p2.getY()));
        return (getArea() == area);
    }
    public boolean contains(Triangle2D t1){
        double side1 = t1.p1.distance(t1.p2);
        double side2 = t1.p2.distance(t1.p3);
        double side3 = t1.p3.distance(t1.p1);
        return (side1 / p1.distance(p2) <= 1 && side2 / p2.distance(p3) <= 1 && side3 / p3.distance(p3) <= 1);
    }
    public boolean overlaps(Triangle2D t) {
        Line2D line1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
        Line2D line2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(), t.p3.getY());
        Line2D line3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(), t.p3.getY());
        Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
        Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());
        return contains(t) || t.contains(this) ||
                line1.intersectsLine(side1) ||
                line1.intersectsLine(side2) ||
                line1.intersectsLine(side3) ||
                line2.intersectsLine(side1) ||
                line2.intersectsLine(side2) ||
                line2.intersectsLine(side3) ||
                line3.intersectsLine(side1) ||
                line3.intersectsLine(side2) ||
                line3.intersectsLine(side3);
    }
}
