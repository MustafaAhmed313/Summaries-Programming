/*
9.10: (Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + x = 0. The class contains:
 ■ Private data fields a, b, and c that represent three coefficients.
 ■ A constructor for the arguments for a, b, and c.
 ■ Three getter methods for a, b, and c.
 ■ A method named getDiscriminant() that returns the discriminant, which is
b^2 - 4ac.
 ■ The methods named getRoot1() and getRoot2() for returning two roots of
the equation
r1 = (-b + root(b^2 - 4ac))/2a
and r2 = (-b - root(b^2 - 4ac))/2a
These methods are useful only if the discriminant is nonNegative. Let these methods return 0
if the discriminant is negative.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.” See Programming Exercise 3.1 for sample runs.
*/

import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic function (a , b , c) : ");
        double ai = input.nextDouble();
        double bi = input.nextDouble();
        double ci = input.nextDouble();
        QuadraticEquation e1 = new QuadraticEquation(ai , bi , ci);
        if (e1.getDiscriminant() > 0)
            System.out.printf("The equation has two real roots :\nRoot 1 = %2.2f\nRoot 2 = %2.2f\n" ,
                    e1.getRoot1() , e1.getRoot2());
        else if (e1.getDiscriminant() == 0)
            System.out.printf("The equation has one real root :\nRoot 1 = %2.2f\n" ,
                    e1.getRoot1());
        else
            System.out.printf("The equation has no real roots");
    }
}
class QuadraticEquation {
    private double a , b , c;
    public QuadraticEquation(double a1 , double b1 , double c1){
        a = a1;
        b = b1;
        c = c1;
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
    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }
    public double getRoot1(){
        if (getDiscriminant() < 0)
            return 0;
        else
            return (-b + Math.sqrt(b * b - a * a * c)) / (2 * a);
    }
    public double getRoot2(){
        if (getDiscriminant() < 0)
            return 0;
        else
            return (-b - Math.sqrt(b * b - a * a * c)) / (2 * a);
    }
}
