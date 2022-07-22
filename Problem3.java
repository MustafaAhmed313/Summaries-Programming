/*
9.3: (Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively.
*/

import java.util.Date;
public class Problem3 {
    public static void main(String[] args){
        Date d1 = new Date();
        d1.setTime(10000);
        System.out.println("The date of " + d1.getTime() + " elapsed is\n" + d1.toString());
        d1.setTime(100000);
        System.out.println("The date of " + d1.getTime() + " elapsed is\n" + d1.toString());
        d1.setTime(1000000);
        System.out.println("The date of " + d1.getTime() + " elapsed is\n" + d1.toString());
        d1.setTime(10000000);
        System.out.println("The date of " + d1.getTime() + " elapsed is\n" + d1.toString());
        d1.setTime(100000000);
        System.out.println("The date of " + d1.getTime() + " elapsed is\n" + d1.toString());
        d1.setTime(1000000000);
        System.out.println("The date of " + d1.getTime() + " elapsed is\n" + d1.toString());
        d1.setTime(1000000000);
        System.out.println("The date of " + d1.getTime() + " elapsed is\n" + d1.toString());
        //10000000000 and 100000000000 are two large values for the long dataType
    }
}
