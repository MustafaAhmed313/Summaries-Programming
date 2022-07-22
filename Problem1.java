/*
9.1: (The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
 ■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
 ■ A no-arg constructor that creates a default rectangle.
 ■ A constructor that creates a rectangle with the specified width and height.
 ■ A method named getArea() that returns the area of this rectangle.
 ■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Rectangle objects—one with width 4 and height 40
and the other with width 3.5 and height 35.9. Display the width, height, area,
and perimeter of each rectangle in this order.
*/


public class Problem1 {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4 , 40);
        Rectangle r2 = new Rectangle(3.5 , 35.9);
        System.out.printf("Rectangle1-->\nWidth : %2.3f\nHeight : %2.3f\nArea : %2.3f\nPerimeter : %2.3f\n"
                            , r1.width , r1.height , r1.getArea() , r1.getPerimeter());
        System.out.printf("Rectangle2-->\nWidth : %2.3f\nHeight : %2.3f\nArea : %2.3f\nPerimeter : %2.3f\n"
                            , r2.width , r2.height , r2.getArea() , r2.getPerimeter());
    }
}
class Rectangle {
    public double width;
    public double height;
    public Rectangle(){ //we can delete it safely
        height = 1;
        width = 1;
    }
    public Rectangle(double w , double h){
        height = h;
        width = w;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return (height + width) * 2;
    }
}
