/*
11.17 (Algebra: perfect square) Write a program that prompts the user to enter an integer m and find the smallest
integer n such that m * n is a perfect square.
(Hint:Store all smallest factors of m into an array list. n is the product of the factors that
appear an odd number of times in the array list. For example, consider m = 90,
store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
in the array list. So, n is 10.) Here are sample runs:
Enter an integer m: 1500
The smallest number n for m * n to be a perfect square is 15
m * n is 22500
Enter an integer m: 63
The smallest number n for m * n to be a perfect square is 7
m * n is 441
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Problem17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer m: ");
        int m = input.nextInt();
        int M = m;
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2 ; M != 1 ; i++){
             while (M % i == 0){
                factors.add(i);
                M /= i;
            }
        }
        int sumN = 0;
        int[] n = factorize(factors);
        for (int i = 0 ; i < n.length ; i++){
            if (n[i] != 0) {
                sumN += n[i];
            }
        }
        System.out.println("The smallest number n for m * n to be a perfect square is " + sumN);
        System.out.println("m * n is " + (m * sumN));
    }
    public static int[] factorize(ArrayList<Integer> list){
        int[] smallest = new int[list.size()];
        int[] frequency = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++){
            int counter = 1;
            for (int j = i + 1 ; j < list.size() ; j++){
                if (list.get(i).equals(list.get(j))){
                    counter++;
                }
            }
            if (counter % 2 != 0){
                smallest[i] = list.get(i);
            }else {
                frequency[i] = list.get(i);
            }
        }
        for (int i = 0 ; i < frequency.length ; i++){
            for (int j = 0 ; j < frequency.length ; j++){
                if (smallest[i] == frequency[j]){
                    smallest[i] = 0;
                }
            }
        }
        return smallest;
    }
    public static int exist(int[] a , int x){
        for (int i = 0 ; i < a.length ; i++){
            if (a[i] == x){
                return i;
            }
        }
        return -1;
    }
}

