/*
13.9: (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radii
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable.
*/

public class Problem9 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10 , "blue" , true);
        Circle c2 = new Circle(10 , "red" , false);
        System.out.println(c1.equals(c2));
        Circle c3 = new Circle(10 , "blue" , true);
        Circle c4 = new Circle(5 , "red" , false);
        System.out.println(c3.equals(c4));
    }
}
