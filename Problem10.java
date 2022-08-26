/*
11.10: (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented using composition.
Define a new stack class that extends ArrayList.
Draw the UML diagram for the classes and then implement MyStack. Write
a test program that prompts the user to enter five strings and displays them in
reverse order.
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 strings: ");
        Mystack s1 = new Mystack();
        for (int i = 0 ; i < 5 ; i++){
            String s = input.next();
            s1.push(s);
        }
        for (int i = 0 ; i < 5 ; i++){
            System.out.print(s1.pop() + " ");
        }
    }
}
class Mystack extends ArrayList{
    private ArrayList<Object> list = new ArrayList<>();
    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.get(getSize() - 1);
    }
    public Object pop(){
        Object o = peek();
        list.remove(getSize() - 1);
        return o;
    }
    public void push(Object o){
        list.add(o);
    }
}
