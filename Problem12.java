/*
11.12: (sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays their sum
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++){
            double n = input.nextDouble();
            list.add(n);
        }
        System.out.println(sum(list));
    }
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0 ; i < list.size() ; i++){
            sum += list.get(i);
        }
        return sum;
    }
}
