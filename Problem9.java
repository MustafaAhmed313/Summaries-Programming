/*
10.9: (The Course class) Revise the Course class as follows:
 ■ The array size is fixed in Listing 10.6. Improve it to automatically increase
the array size by creating a new larger array and copying the contents of the
current array to it.
 ■ Implement the dropStudent method.
 ■ Add a new method named clear() that removes all students from the
course.
Write a test program that creates a course, adds three students, removes one,
and displays the students in the course.
*/

public class Problem9 {
    public static void main(String[] args){
        Course CS102 = new Course("computerScience");
        CS102.addStudent("Mostafa ahmed");
        CS102.addStudent("Mahmoud ahmed");
        CS102.addStudent("Mohammed osama");
        System.out.println("Students before remove");
        for (String e : CS102.getStudents()) {
            if (e == null)
                break;
            System.out.print(e + "\n");
        }
        System.out.println();
        CS102.dropStudent("Mohammed osama");
        System.out.println("Students after remove one");
        for (String e : CS102.getStudents()) {
            if (e == null)
                break;
            System.out.print(e + "\n");
        }
    }
}
class Course{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        for (int i = 0 ; i < numberOfStudents ; i++)
            if (students[i] == student){
                students[i] = null;
                numberOfStudents--;
                break;
            }
    }
    public void clear(){
        students = new String[100];
    }
}
