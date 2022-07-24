/*
10.1: (The Time class) Design a class named Time. The class contains:
 ■ The data fields hour, minute, and second that represent a time.
 ■ A no-arg constructor that creates a Time object for the current time. (The
values of the data fields will represent the current time.)
 ■ A constructor that constructs a Time object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds. (The values of the data
fields will represent this time.)
■ A constructor that constructs a Time object with the specified hour, minute,
and second.
 ■ Three getter methods for the data fields hour, minute, and second,
respectively.
 ■ A method named setTime(long elapseTime) that sets a new time
for the object using the elapsed time. For example, if the elapsed time is
555550000 milliseconds, the hour is 10, the minute is 19, and the second is
10.
Draw the UML diagram for the class and then implement the class. Write
a test program that creates two Time objects (using new Time() and new
Time(555550000)) and displays their hour, minute, and second in the format
hour:minute:second.
(Hint: The first two constructors will extract the hour, minute, and second
from the elapsed time. For the no-arg constructor, the current time can be
obtained using System.currentTimeMillis(), as shown in Listing 2.7,
ShowCurrentTime.java.)
*/

public class Problem1 {
    public static void main(String[] args){
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        System.out.printf("Time object 1:-\n%d:%d:%d\nTime object 2:-\n%d:%d:%d" ,
                t1.getHour() , t1.getMinute() , t1.getSecond() , t2.getHour() , t2.getMinute() , t2.getSecond());
    }
}
class Time{
    private int hour , minute , second;
    public Time(){
        long curruntMillis = System.currentTimeMillis();
        long totalSeconds = curruntMillis / 1000;
        second = (int) (totalSeconds % 60);
        long totalMunites = totalSeconds / 60;
        minute = (int) (totalMunites % 60);
        long totalHours = totalMunites / 60;
        hour = (int) (totalHours % 24);
    }
    public Time(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        second = (int) (totalSeconds % 60);
        long totalMunites = totalSeconds / 60;
        minute = (int) (totalMunites % 60);
        long totalHours = totalMunites / 60;
        hour = (int) (totalHours % 24);
    }
    public Time(int newHour , int newMinute , int newSecond){
        hour = newHour;
        minute = newMinute;
        second = newSecond;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setTime(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        second = (int) (totalSeconds % 60);
        long totalMunites = totalSeconds / 60;
        minute = (int) (totalMunites % 60);
        long totalHours = totalMunites / 60;
        hour = (int) (totalHours % 24);
    }
}