/*
9.12: (Geometry: intersecting point) Suppose two line segments intersect.
The two endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line
segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
these four endpoints and displays the intersecting point. As discussed in Programming Exercise 3.25,
the intersecting point can be found by solving a linear equation.
Use the LinearEquation class in Programming Exercise 9.11 to solve this
equation. See Programming Exercise 3.25 for sample runs.
(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
*/

import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the four points for the two line segments(x1 , y1 , x2 , y2 , x3 , y3 , x4 , y4) :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        //using LinearEquation Class in Problem11:-
        LinearEquation le2 = new LinearEquation((y1 - y2) , -(x1 - x2) , (y3 - y4) ,
                -(x3 - x4) , ((y1 - y2) * x1 - (x1 - x2) * y1) , ((y3 - y4) * x3 - (x3 - x4) * y3));
        if (le2.isSolvable())
            System.out.printf("The intersecting point is (%2.2f , %2.2f)\n" , le2.getX() , le2.getY());
        else
            System.out.println("There is no intersecting point");
    }
}
