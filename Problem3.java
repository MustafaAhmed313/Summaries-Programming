/*
13.3: (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
public static void sort(ArrayList<Number> list)
*/

import java.util.ArrayList;
public class Problem3 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(50);
        list.add(90);
        list.add(5);
        for (Number e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
        sort(list);
        for (Number e : list) {
            System.out.print(e + " ");
        }
    }
    public static void sort(ArrayList<Number> list) {
        for (int i = 0 ; i < list.size() ; i++) {
            for (int j = list.size()-1 ; j > i ; j--) {
                if ((Integer)list.get(i) > (Integer)list.get(j)) {
                    Number n = list.remove(i);
                    list.add(j , n);
                }
            }
        }
    }
}
