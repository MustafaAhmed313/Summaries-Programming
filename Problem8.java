/*
13.8: (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform
a deep copy of the list field.
*/

import java.util.ArrayList;
public class Problem8 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack s1 = new MyStack();
        s1.push(2);
        s1.push("String");
        s1.push(true);
        s1.push(new Circle());
        MyStack s2 = s1.clone();
        System.out.println(s1);
        System.out.println(s2);
    }
}


class MyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();
    public MyStack() {
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int getSize() {
        return list.size();
    }
    public Object peek() {
        return list.get(getSize() - 1);
    }
    public Object pop() {
    Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    public void push(Object o) {
        list.add(o);
    }
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
    @Override
    public MyStack clone() throws CloneNotSupportedException {
        return (MyStack)super.clone();
    }
}
