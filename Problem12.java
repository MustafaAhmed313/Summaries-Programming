/*
13.12: (Sum the areas of geometric objects) Write a method that sums the areas of all the
geometric objects in an array. The method signature is:
public static double sumArea(GeometricObject[] a)
Redesign the Rectangle class
 Write a test program that creates an array of four objects (two circles and two
rectangles) and computes their total area using the sumArea method
*/

public class Problem12 {
    public static void main(String[] args) {
        GeometricObject[] shapes = new GeometricObject[4];
        shapes[0] = new Circle(10 , "white" , true);
        shapes[1] = new Circle(5 , "white" , true);
        shapes[2] = new Rectangle(10 , 5 , "white" , true);
        shapes[3] = new Rectangle(6 , 4 , "white" , true);
        System.out.printf("Sum Of Geometric[] = %6.3f" , sumArea(shapes));
    }
    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject e : a) {
            sum += e.getArea();
        }
        return sum;
    }
}
