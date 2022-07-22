/*
9.6: (Stopwatch) Design a class named StopWatch. The class contains:
 ■ Private data fields startTime and endTime with getter methods.
 ■ A no-arg constructor that initializes startTime with the current time.
 ■ A method named start() that resets the startTime to the current time.
 ■ A method named stop() that sets the endTime to the current time.
 ■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
 Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort.
*/

public class Problem6 {
    public static void main(String[] args){
        int[] numbers = new int[100000];
        randomValues(numbers);
        int temp;
        StopWatch w = new StopWatch();
        w.start();
        for (int i = 0 ; i < numbers.length ; i++){
            if (i == numbers.length - 1)
                break;
            else if (numbers[i] > numbers[i + 1]){
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        w.stop();
        System.out.printf("The time elapsed of sorting numbers is %d milliseconds" , w.getElapsedTime());
    }
    public static void randomValues(int[] a){
        for (int i = 0 ; i < a.length ; i++)
            a[i] = (int)(Math.random() * 100);
    }
}
class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    } //we can delete it safely
    public long getEndTime() {
        return endTime;
    } //we can delete it safely
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
