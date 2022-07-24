/*
10.3: (The MyInteger class) Design a class named MyInteger. The class contains:
 ■ An int data field named value that stores the int value represented by this
object.
 ■ A constructor that creates a MyInteger object for the specified int value.
 ■ A getter method that returns the int value.
 ■ The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
 ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
 ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
 ■ The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
 ■ A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
 ■ A static method parseInt(String) that converts a string into an int
value
Draw the UML diagram for the class and then implement the class.
Write a client program that tests all methods in the class.
*/

public class Problem3 {
    public static void main(String[] args){
        MyInteger n = new MyInteger(2127017);
        System.out.printf("MyInteger test1:-\nValue = %d\nOdd : %b\nEven : %b\nPrime : %b\nEquals 2127170 : %b\n"
        , n.getValue() , n.isOdd() , n.isEven() , n.isPrime() , n.equals(2127170));
        MyInteger n1 = new MyInteger(2127018);
        System.out.printf("MyInteger test2:-\nValue = %d\nOdd : %b\nEven : %b\nPrime : %b\nEquals MyInteger1 : %b\n"
                , n1.getValue() , n1.isOdd(n1) , n1.isEven(n1) , n1.isPrime(n1) , n1.equals(n));
        MyInteger n2 = new MyInteger(2127018);
        System.out.printf("MyInteger test3:-\nValue = %d\nOdd : %b\nEven : %b\nPrime : %b\nEquals MyInteger2 : %b\n"
                , n2.getValue() , n2.isOdd(50) , n2.isEven(60) , n2.isPrime(3) , n2.equals(1));
        System.out.println("Numbers of The array is " + MyInteger.parseInt(new char[]{'1' , '2' , '3'}));
        System.out.println("Numbers of The string is " + MyInteger.parseInt("123"));
    }
}
class MyInteger{
    private int value;
    public MyInteger(int newValue) {
        value = newValue;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven(){
        return (value % 2 == 0);
    }
    public boolean isOdd(){
        return !(isEven());
    }
    public boolean isPrime(){
        if(value <= 1) {
            return false;
        }
        for(int i = 2 ; i < value / 2 ; i++) {
            if((value % i) == 0)
                return  false;
        }
        return true;
    }
    public static boolean isEven(int n){
        return (n % 2 == 0);
    }
    public static boolean isOdd(int n){
        return !(isEven(n));
    }
    public static boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
        for(int i = 2 ; i < n / 2 ; i++) {
            if((n % i) == 0)
                return  false;
        }
        return true;
    }
    public static boolean isEven(MyInteger n){
        return (n.value % 2 == 0);
    }
    public static boolean isOdd(MyInteger n){
        return !(isEven(n.value));
    }
    public static boolean isPrime(MyInteger n){
        if(n.value <= 1) {
            return false;
        }
        for(int i = 2 ; i < n.value / 2 ; i++) {
            if((n.value % i) == 0)
                return  false;
        }
        return true;
    }
    public boolean equals(int n){
        return (value == n);
    }
    public boolean equals(MyInteger n){
        return (value == n.value);
    }
    public static int parseInt(char[] c){
        String s = new String(c);
        return Integer.parseInt(s);
    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
}