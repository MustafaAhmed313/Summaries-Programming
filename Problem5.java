/*
11.5: (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
to replace an array to store students. Draw the new UML diagram for the class.
You should not change the original contract of the Course class
(i.e., the definition of the constructors and methods should not be changed, but the private
members may be changed.)
*/

import java.util.ArrayList;
public class Problem5 {
}
class Course{
    private String courseName;
    private ArrayList <String> students = new ArrayList<>();
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        students.add(student);
    }
    public String[] getStudents() {
        String[] std = new String[students.size()];
        students.toArray(std);
        return std;
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        students.remove(student);
    }
    public void clear(){
        students =  new ArrayList<>();
    }
}
