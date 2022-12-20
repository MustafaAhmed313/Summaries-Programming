/*
13.2: (Shuffle ArrayList) Write the following method that shuffles an ArrayList of
numbers:
public static void shuffle(ArrayList<Number> list)
*/
import java.util.ArrayList;
public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(5);
        list.add(2.45);
        list.add(27462848721.23);
        list.add(321857130);
        for (Number e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
        shuffle(list);
        for (Number e : list) {
            System.out.print(e + " ");
        }
    }
    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0 ; i < list.size() ; i++) {
            int randIndex = (int) (Math.random() * list.size());
            if (list.get(i) instanceof Integer) {
               Integer n = ((Integer) list.get(i));
               list.remove(i);
               list.add(randIndex , n);
            }else if (list.get(i) instanceof Double) {
                Double n = ((Double) list.get(i));
                list.remove(i);
                list.add(randIndex , n);
            }else if (list.get(i) instanceof Float) {
                Float n = ((Float) list.get(i));
                list.remove(i);
                list.add(randIndex, n);
            }else {
                Long n = ((Long) list.get(i));
                list.remove(i);
                list.add(randIndex, n);
            }
            //you can add many data types here with the same sequence:-
        }
    }
}
