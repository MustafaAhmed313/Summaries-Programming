/*
11:14 (Combine two lists) Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
 ArrayList<Integer> list1, ArrayList<Integer> list2)
 For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
{2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
each with five integers, and displays their union. The numbers are separated by
exactly one space in the output. Here is a sample run:
Enter five integers for list1: 3 5 45 4 3
Enter five integers for list2: 33 51 5 4 13
The combined list is 3 5 45 4 3 33 51 5 4 13
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Problem14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers for list1: ");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++){
            int n = input.nextInt();
            list1.add(n);
        }
        System.out.print("Enter five numbers for list2: ");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++){
            int n = input.nextInt();
            list2.add(n);
        }
        System.out.println("The combined list is ");
        for (Integer e : union(list1 , list2)){
            System.out.print(e + " ");
        }
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1 , ArrayList<Integer> list2){
        ArrayList<Integer> listOfUnion = new ArrayList<>();
        listOfUnion.addAll(list1);
        listOfUnion.addAll(list2);
        return listOfUnion;
    }
}
