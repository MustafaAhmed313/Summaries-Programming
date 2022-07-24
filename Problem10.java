/*
10.10: (The Queue class) Section 10.6 gives a class for Stack. Design a class named
Queue for storing integers. Like a stack, a queue holds elements. In a stack, the
elements are retrieved in a last-in first-out fashion. In a queue, the elements are
retrieved in a first-in first-out fashion. The class contains:
 ■ An int[] data field named elements that store the int values in the
queue.
 ■ A data field named size that stores the number of elements in the queue.
 ■ A constructor that creates a Queue object with default capacity 8.
 ■ The method enqueue(int v) that adds v into the queue.
 ■ The method dequeue() that removes and returns the element from the
queue.
 ■ The method empty() that returns true if the queue is empty.
 ■ The method getSize() that returns the size of the queue.
Draw a UML diagram for the class. Implement the class with the initial array
size set to 8. The array size will be doubled once the number of the elements
exceeds the size. After an element is removed from the beginning of the array,
you need to shift all elements in the array one position the left. Write a test
program that adds 20 numbers from 1 to 20 into the queue and removes these
numbers and displays them
*/

public class Problem10 {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        for (int i = 0 ; i < 20 ; i++)
            queue1.enqueue(i+1);
        for (int i = 0 ; i < 20 ; i++)
            System.out.print(queue1.dequeue() + " ");
    }
}
class Queue {
    private int[] elements;
    private int size = 0;
    public Queue(){
        elements = new int[8];
    }
    public void enqueue(int v){
        if (size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements , 0 , temp , 0 , elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }
    public int dequeue(){
        int temp = elements[0];
        for (int i = 1 ; i < size ; i++)
            elements[i - 1] = elements[i];
        size--;
        return temp;
    }
    public boolean empty(){
        return size == 0;
    }
    public int getSize() {
        return size;
    }
}