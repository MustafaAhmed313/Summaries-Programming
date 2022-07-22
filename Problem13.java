/*
9.13: (The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array. Here is a sample run:
Enter the number of rows and columns in the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is 45 at (1, 2)
*/

import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:");
        int r = input.nextInt();
        int c = input.nextInt();
        double[][] arr = new double[r][c];
        System.out.println("Enter The array:");
        for (int i = 0 ; i < arr.length ; i++)
            for (int j = 0 ; j <  arr[0].length ; j++)
                arr[i][j] = input.nextDouble();
        Location l1 = Location.locateLargest(arr);
        System.out.printf("The location of the largest element is %2.1f at (%d, %d)"
                , l1.maxValue , l1.row , l1.column);
    }
}
class Location{
    public int row;
    public int column;
    public double maxValue;
    public static Location locateLargest(double[][] a){
        Location l = new Location();
        l.maxValue = a[0][0];
        for (int i = 0 ; i < a.length ; i++){
            for (int j = 0 ; j < a[0].length ; j++){
                if (a[i][j] > l.maxValue){
                    l.maxValue = a[i][j];
                    l.row = i;
                    l.column = j;
                }
            }
        }
        return l;
    }
}
