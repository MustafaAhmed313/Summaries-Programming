/*
11.15: (Area of a convex polygon) A polygon is convex if it contains any line segments
that connects two points of the polygon. Write a program that prompts the user to
enter the number of points in a convex polygon, then enter the points clockwise,
and display the area of the polygon. Here is a sample run of the program:
Enter the number of the points: 7
Enter the coordinates of the points:
-12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -3.5
The total area is 250.075
*/
import java.util.Scanner;
public class Problem15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the points: ");
        int n = input.nextInt();
        double[][] points = new double[n][2];
        System.out.println("Enter the coordinates of the points: ");
        for (int i = 0 ; i < points.length ; i++){
            for (int j = 0 ; j < points[0].length ; j++){
                points[i][j] = input.nextDouble();
            }
        }
        System.out.printf("The total area is %2.3f" , getArea(points));
    }
    public static double getArea(double[][] a){
        double operation = matrix(a[0][0] , a[0][1] , a[1][0] , a[1][1]) + matrix(a[1][0] , a[1][1] , a[2][0] , a[2][1])
                + matrix(a[2][0] , a[2][1] , a[3][0] , a[3][1]) + matrix(a[3][0] , a[3][1] , a[4][0] , a[4][1])
                + matrix(a[4][0] , a[4][1] , a[5][0] , a[5][1]) + matrix(a[5][0] , a[5][1] , a[6][0] , a[6][1])
                + matrix(a[6][0] , a[6][1] , a[0][0] , a[0][1]);
        return 0.5 * Math.abs(operation);
    }
    public static double matrix(double x1 , double y1 , double x2 , double y2){
        return (x1 * y2) - (x2 * y1);
    }
}
