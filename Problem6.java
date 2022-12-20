/*
13.6: (The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram and
implement the compareTo method to compare the circles on the basis of area.
Write a test class to find the larger of two instances of ComparableCircle objects.
*/

import java.util.Objects;

public class Problem6 {
    public static void main(String[] args) {
        ComparableCircle cc1 = new ComparableCircle(10 , "red" , true);
        ComparableCircle cc2 = new ComparableCircle(20 , "yellow" , false);
        System.out.println(cc1.compareTo(cc2));
    }
}

class ComparableCircle extends Circle implements Comparable<GeometricObject>{
    public ComparableCircle() {
        super();
    }
    public ComparableCircle(double radius , String color , boolean filled) {
        super(radius, color, filled);
    }


    @Override
    public int compareTo(GeometricObject obj) {
        if (Objects.equals(max(this, obj), this)) return 1;
        else if (Objects.equals(max(this, obj), obj)) return -1;
        else return 0;
    }
}
