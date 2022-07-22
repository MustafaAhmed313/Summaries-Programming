/*
9.11: (Algebra: 2 * 2 linear equations)
Design a class named LinearEquation for a (2 * 2 system of linear equations):
ax + by = e , cx + dy = f
x = (ed - bf)/(ad - bc) , y = (af - ec)/(ad - bc)
The class contains:
 ■ Private data fields a, b, c, d, e, and f.
 ■ A constructor with the arguments for a, b, c, d, e, and f.
 ■ Six getter methods for a, b, c, d, e, and f.
 ■ A method named isSolvable() that returns true if ad - bc is not 0.
 ■ Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.” See Programming
Exercise 3.3 for sample runs.
*/

import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter (a , b , c , d , e , f) : ");
        double ai = input.nextDouble();
        double bi = input.nextDouble();
        double ci = input.nextDouble();
        double di = input.nextDouble();
        double ei = input.nextDouble();
        double fi = input.nextDouble();
        LinearEquation le1 = new LinearEquation(ai , bi , ci , di , ei , fi);
        if (le1.isSolvable())
            System.out.printf("X = %2.2f\nY = %2.2f\n" , le1.getX() , le1.getY());
        else
            System.out.println("The equation has no solution.");
    }
}
class LinearEquation{
    private double a , b , c , d , e , f;
    public LinearEquation(double a1 , double b1 , double c1 , double d1 , double e1 , double f1){
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        e = e1;
        f = f1;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }
    public boolean isSolvable(){
        return (a * d - b * c != 0);
    }
    public double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }
    public double getY(){
        return (a * f - e * c) / (a * d - b * c);
    }
}
