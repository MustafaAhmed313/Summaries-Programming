/*
11.7: (Shuffle ArrayList) Write the following method that shuffles the elements in
an ArrayList of integers.
public static void shuffle(ArrayList<Integer> list)
*/

import java.util.ArrayList;

public class Problem7 {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>();
        shuffle(list);
    }
    public static void shuffle(ArrayList<Integer> list){
        java.util.Collections.shuffle(list);
    }

}
