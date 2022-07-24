/*
10.15: (Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle that encloses a set of points
in a two-dimensional plane, as shown in Figure 10.24d. Write a method that returns a bounding rectangle for a set of
points in a two-dimensional plane, as follows:
public static MyRectangle2D getRectangle(double[][] points)
The Rectangle2D class is defined in Programming Exercise 10.13. Write a
test program that prompts the user to enter five points and displays the bounding
rectangle’s center, width, and height. Here is a sample run:
Enter five points: 1.0 2.5 3 4 5 6 7 8 9 10
The bounding rectangle's center (5.0, 6.25), width 8.0, height 7.5
*/
import java.util.Scanner;
public class Problem15 {
    public static void main(String[] args){
        double[][] points = new double[5][2];
        System.out.println("Enter five points: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < points.length ; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        MyRectangle2D r1 = getRectangle(points);
        System.out.printf("The bounding rectangles center (%2.3f , %2.3f) , width %2.3f , height %2.3f",
                r1.getX_Center() , r1.getY_Center() , r1.getWidth() , r1.getHeight());

    }
    public static MyRectangle2D getRectangle(double[][] points) {
        final int COLUMN_X = 0;
        final int COLUMN_Y = 1;
        double[] minMaxX = minMax(points, COLUMN_X);
        double[] minMaxY = minMax(points, COLUMN_Y);
        double x = (minMaxX[1] + minMaxX[0]) / 2;
        double y = (minMaxY[1] + minMaxY[0]) / 2;
        double height = Math.sqrt(Math.pow(minMaxY[1] - minMaxY[0], 2));
        double width = Math.sqrt(Math.pow(minMaxX[1] - minMaxX[0], 2));
        return new MyRectangle2D(x, y, width, height);
    }
    public static double[] minMax(double[][] points, int col) {
        double[] minMax = new double[2];
        minMax[0] = minMax[1] = points[0][col];
        for (int i = 0; i < points.length; i++) {
            if (points[i][col] < minMax[0])
                minMax[0] = points[i][col];
            if (points[i][col] > minMax[1])
                minMax[0] = points[i][col];
        }
        return minMax;
    }
}

