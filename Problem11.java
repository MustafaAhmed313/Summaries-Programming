/*
10.11: (Geometry: the Circle2D class) Define the Circle2D class that contains:
 ■ Two double data fields named x and y that specify the center of the circle
with getter methods.
 ■ A data field radius with a getter method.
 ■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
 ■ A constructor that creates a circle with the specified x, y, and radius.
 ■ A method getArea() that returns the area of the circle.
 ■ A method getPerimeter() that returns the perimeter of the circle.
 ■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle (see Figure 10.21a).
 ■ A method contains(Circle2D circle) that returns true if the specified circle is inside this circle
 (see Figure 10.21b).
 ■ A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle
 (see Figure 10.21c).
 Draw the UML diagram for the class and then implement the class. Write a test
program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
displays its area and perimeter, and displays the result of c1.contains(3,
3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
Circle2D(3, 5, 2.3)).
*/

public class Problem11 {
    public static void main(String[] args){
        Circle2D circle1 = new Circle2D(2, 2, 5.5);
        System.out.printf("""
                        For circle1 object:-
                        The Area = %2.3f
                        The perimeter = %2.3f
                        Circle 1 contains (3,3) : %b
                        Circle 1 contains Circle 2 : %b
                        Circle 1 overlaps Circle 3 : %b 
                        """
        , circle1.getArea() , circle1.perimeter() ,
        circle1.contains(3,3) , circle1.contains(new Circle2D(4, 5, 10.5)),
        circle1.overLaps(new Circle2D(3, 5, 2.3)));
    }
}
class Circle2D {
    private double x_center;
    private double y_center;
    private double radius;
    public Circle2D() {
        x_center = 0;
        y_center = 0;
        radius = 1;
    }
    public Circle2D(double newX , double newY , double newRadius){
        x_center = newX;
        y_center = newY;
        radius = newRadius;
    }
    public double getX_center() {
        return x_center;
    }
    public double getY_center() {
        return y_center;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x , double y){
        return(Math.sqrt(Math.pow(x - x_center , 2) + Math.pow(y - y_center , 2))) < radius;
    }
    public boolean contains(Circle2D circle1){
        return
            radius >= (circle1.radius) +
                    (Math.sqrt(Math.pow(circle1.x_center - x_center , 2) + Math.pow(circle1.y_center - y_center , 2)));
    }
    public boolean overLaps(Circle2D circle1){
        double distance = Math.sqrt(Math.pow(circle1.x_center - x_center, 2) + (Math.pow(circle1.y_center - y_center, 2)));
        return distance <= (this.radius + circle1.radius) && distance >= Math.abs(this.radius - circle1.radius);
    }
}
