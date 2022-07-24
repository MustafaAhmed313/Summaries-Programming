/*
10.14: (The MyDate class) Design a class named MyDate. The class contains:
 ■ The data fields year, month, and day that represent a date. month is
0-based, i.e., 0 is for January.
 ■ A no-arg constructor that creates a MyDate object for the current date.
 ■ A constructor that constructs a MyDate object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds.
 ■ A constructor that constructs a MyDate object with the specified year,
month, and day.
 ■ Three getter methods for the data fields year, month, and day, respectively.
 ■ A method named setDate(long elapsedTime) that sets a new date for
the object using the elapsed time.
Draw the UML diagram for the class and then implement the class. Write a
test program that creates two MyDate objects (using new MyDate() and new
MyDate(34355555133101L)) and displays their year, month, and day.
(Hint: The first two constructors will extract the year, month, and day from
the elapsed time. For example, if the elapsed time is 561555550000 milliseconds,
the year is 1987, the month is 9, and the day is 18. You may use the
GregorianCalendar class discussed in Programming Exercise 9.5 to simplify coding.)
*/
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Problem14 {
    public static void main(String[] args){
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(34355555133101L);
        MyDate d3 = new MyDate(561555550000L);
        System.out.println("MyDate object1 " + d1.getDay() + " : " +  d1.getMonth() + " : " + d1.getYear() + "\n" +
                "MyDate object2 " + d2.getDay() + " : " +  d2.getMonth() + " : " + d2.getYear() + "\n" +
                "MyDate object3 " + d3.getDay() + " : " +  d3.getMonth() + " : " + d3.getYear());
    }
}
class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(System.currentTimeMillis());
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
    public MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
    public MyDate(int newYear , int newMonth , int newDay) {
        year = newYear;
        month = newMonth;
        day = newDay;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
}
