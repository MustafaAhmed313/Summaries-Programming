/*
13.13: (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
to add a clone method to perform a deep copy on the students field.
*/

public class Problem13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course cs = new Course("CS201");
        cs.addStudent("Mustafa Ahmed");
        cs.addStudent("Mona Ahmed");
        cs.addStudent("Islam Shaker");
        String[] copyStudents = cs.clone();
        for (String std : copyStudents) {
            if (std != null) {
                System.out.println(std + " Enrolled in CS201");
            }
        }
    }
}

class Course implements Cloneable {
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

    @Override
    public String[] clone() {
        return students.clone();
    }
}