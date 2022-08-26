/*
11.4: (Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)
Write a test program that prompts the user to enter a sequence of numbers ending
with 0, and invokes this method to return the largest number in the input.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;
public class Problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        int num = 1;
        while (num != 0){
            num = input.nextInt();
            Integer i = num;
            list.add(i);
        }
        System.out.println(max(list));
    }
    public static Integer max(ArrayList<Integer> list){
        if (list.isEmpty())
            return null;
        return java.util.Collections.max(list);
    }
}
