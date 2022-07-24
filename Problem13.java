/*
10.13: (Geometry: the MyRectangle2D class) Define the MyRectangle2D class that
contains:
 ■ Two double data fields named x and y that specify the center of the rectangle with getter and setter methods.
 (Assume that the rectangle sides are parallel to x- or y- axes.)
 ■ The data fields width and height with getter and setter methods.
 ■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
1 for both width and height.
 ■ A constructor that creates a rectangle with the specified x, y, width, and
height.
■ A method getArea() that returns the area of the rectangle.
 ■ A method getPerimeter() that returns the perimeter of the rectangle.
 ■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this rectangle (see Figure 10.24a).
 ■ A method contains(MyRectangle2D r) that returns true if the specified rectangle is inside this rectangle
 (see Figure 10.24b).
 ■ A method overlaps(MyRectangle2D r) that returns true if the specified rectangle overlaps with this rectangle
 (see Figure 10.24c).
 Draw the UML diagram for the class and then implement the class. Write a test
program that creates a MyRectangle2D object r1 (new MyRectangle2D(2,
2, 5.5, 4.9)), displays its area and perimeter, and displays the result of
r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)), and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
*/

public class Problem13 {
    public static void main(String[] args){
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.printf("""
                Rectangle 1:-
                Area = %2.3f
                Perimeter = %2.3f
                r1 contains (3,3) : %b
                r1 contains r2 : %b
                r1 overlaps r3 : %b
                """
        , r1.getArea() , r1.getPerimeter() , r1.contains(new MyPoint(3,3)) ,
          r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ,
          r1.overLaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}
class MyRectangle2D {
    private double x_Center;
    private double y_Center;
    private double width;
    private double height;
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;
    private MyPoint p4;
    public MyRectangle2D(){
        x_Center = y_Center = 0;
        width = height = 1;
        p1 = new MyPoint(x_Center + height / 2 , y_Center + width / 2);
        p2 = new MyPoint(x_Center + height / 2 , y_Center - width / 2);
        p3 = new MyPoint(x_Center - height / 2 , y_Center - width / 2);
        p4 = new MyPoint(x_Center - height / 2 , y_Center + width / 2);
    }
    public MyRectangle2D(double x , double y , double newWidth , double newHeight){
        x_Center = x;
        y_Center = y;
        width = newWidth;
        height = newHeight;
        p1 = new MyPoint(x_Center + height / 2 , y_Center + width / 2);
        p2 = new MyPoint(x_Center + height / 2 , y_Center - width / 2);
        p3 = new MyPoint(x_Center - height / 2 , y_Center - width / 2);
        p4 = new MyPoint(x_Center - height / 2 , y_Center + width / 2);
    }
    public void setX_Center(double x_Center) {
        this.x_Center = x_Center;
    }
    public void setY_Center(double y_Center) {
        this.y_Center = y_Center;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getY_Center() {
        return y_Center;
    }
    public double getX_Center() {
        return x_Center;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public boolean contains(MyPoint p){
        return (p.getX() < p1.getX() && p.getX() > p3.getX()) && (p.getY() < p1.getY() && p.getY() > p3.getY());
    }
    public boolean contains(MyRectangle2D r){
        return (contains(r.p1) && contains(r.p2) && contains(r.p3) && contains(r.p4));
    }
    public boolean overLaps(MyRectangle2D r){
        return (contains(r.p1) || contains(r.p2) || contains(r.p3) || contains(r.p4) ||
                r.contains(p1) || r.contains(p2) || r.contains(p3) || r.contains(p4));
    }
}
