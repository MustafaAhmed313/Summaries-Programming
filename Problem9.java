/*
11.9: (Largest rows and columns) Write a program that randomly fills in 0s and 1s
into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
most 1s. (Hint: Use two ArrayLists to store the row and column indices with
the most 1s.) Here is a sample run of the program:
Enter the array size n: 4
The random array is
0011
0011
1101
1010
The largest row index: 2
The largest column index: 2, 3
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Problem9 {
    static int size;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size n: ");
        size = input.nextInt();
        int[][] random = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0 ; j < size ; j++){
                random[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0 ; j < size ; j++){
                System.out.print(random[i][j]);
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + largestRow(random));
        System.out.println("The largest column index: " + largestColumn(random));
    }
    public static ArrayList<Integer> largestRow(int[][] b){
        ArrayList<Integer> rows = new ArrayList<>();
        int[] count = new int[size];
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (b[i][j] == 1){
                    count[i]++;
                }
            }
        }
        int max = max(count);
        getIndex(rows , count , max);
        return rows;
    }
    public static ArrayList<Integer> largestColumn(int[][] b){
        ArrayList<Integer> columns = new ArrayList<>();
        int[] count = new int[size];
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (b[j][i] == 1){
                    count[i]++;
                }
            }
        }
        int max = max(count);
        getIndex(columns , count , max);
        return columns;
    }
    public static int max(int[] a){
        int maximum = a[0];
        for (int i = 0 ; i < size ; i++){
            if (a[i] > maximum){
                maximum = a[i];
            }
        }
        return maximum;
    }
    public static void getIndex(ArrayList<Integer> list , int[] c , int max){
        for (int i = 0 ; i < size ; i++){
            if (c[i] >= max){
                list.add(i);
            }
        }
    }
}

