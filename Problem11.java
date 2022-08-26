/*
11.11: (Sort ArrayList) Write the following method that sorts an ArrayList of
numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays them in increasing order.
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++){
            int n = input.nextInt();
            list.add(n);
        }
        sort(list);
        for (Integer e : list){
            System.out.print(e + " ");
        }
    }
    public static void sort(ArrayList<Integer> list){
        java.util.Collections.sort(list);
    }
}

