/*
11.6: (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop
to display all the elements in the list by invoking the object’s toString()
method.
*/
import java.util.ArrayList;
import java.util.Date;

public class Problem6 {
    public static void main(String[] args){
        ArrayList <Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add("mostafa");
        list.add(new Circle());
        for (int i = 0 ; i < 4 ; i++){
            System.out.println(list.get(i).toString());
        }
    }
}
class Loan{
}
class Circle{
}
