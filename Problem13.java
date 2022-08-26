/*
11.13: (Remove duplicates) Write a method that removes the duplicate elements from
an array list of integers using the following header:
public static void removeDuplicate(ArrayList<Integer> list)
Write a test program that prompts the user to enter 10 integers to a list and displays the distinct integers separated
by exactly one space. Here is a sample run:
Enter ten integers: 34 5 3 5 6 4 33 2 2 4
The distinct integers are 34 5 3 6 4 33 2
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            int n = input.nextInt();
            list.add(n);
        }
        removeDuplicate(list);
        for (Integer e : list){
            System.out.print(e + " ");
        }
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0 ; i < list.size() ; i++){
            for (int j = i + 1 ; j < list.size() ; j++){
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
    }
}
