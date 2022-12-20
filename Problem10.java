/*
13.10: (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
extend GeometricObject and implement the Comparable interface. Override
the equals method in the Object class. Two Rectangle objects are equal
if their areas are the same. Draw the UML diagram that involves Rectangle,
GeometricObject, and Comparable.
*/
public class Problem10 {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(10 , 5 , "blue" , true);
        Rectangle r2 = new Rectangle(10 , 5 , "blue" , true);
        Rectangle r3 = new Rectangle(5 , 5 , "blue" , true);
        Rectangle r4 = new Rectangle(10 , 5 , "blue" , true);
        System.out.println(r1.equals(r2));
        System.out.println(r3.equals(r4));
    }
}
