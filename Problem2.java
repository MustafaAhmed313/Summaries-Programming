/*
11.2: (The Person, Student, Employee, Faculty, and Staff classes) Design a
class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee. A person has a name,
address, phone number, and email address. A student has a class status (freshman,
sophomore, junior, or senior). Define the status as a constant. An employee has
an office, salary, and date hired. Use the MyDate class defined in Programming
Exercise 10.14 to create an object for date hired. A faculty member has office
hours and a rank. A staff member has a title. Override the toString method in
each class to display the class name and the person’s name.
Draw the UML diagram for the classes and implement them.
Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and
invokes their toString() methods.
*/
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Problem2 {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.toString());
        Student s = new Student();
        System.out.println(s.toString());
        Employee e = new Employee();
        System.out.println(e.toString());
        Faculty f = new Faculty();
        System.out.println(f.toString());
        Staff st = new Staff();
        System.out.println(st.toString());
    }
}
class Person{
    private String name , address , phoneNumber , emailAddress;
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Class name : Person\nname : " + name;
    }
}
class Employee extends Person{
    private String office;
    private double salary;
    private MyDate dateHired;
    @Override
    public String toString(){
        return "Class name : Employee\nname : " + super.getName();
    }
}
class Student extends Person{
    final int FRESHMAN = 1 , SOPHOMORE = 2 , JUNIOR = 3 , SENIOR = 4;
    private int status;
    @Override
    public String toString(){
        return "Class name : Student\nname : " + super.getName();
    }
}
class Faculty extends Employee{
    private int officeHours;
    private String rank;
    @Override
    public String toString(){
        return "Class name : Faculty\nname : " + super.getName();
    }
}
class Staff extends Employee{
    private String title;
    @Override
    public String toString(){
        return "Class name : staff\nname : " + super.getName();
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
