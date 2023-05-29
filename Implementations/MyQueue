public class MyQueue {
    private int[] q;
    private int front = -1;
    private int size = 0;
    public MyQueue() {q = new int[10];}
    public int size() {return size;}
    public boolean isEmpty() {return size == 0;}
    public void enqueue(int val) throws IllegalStateException {
        if (size == q.length) throw new IllegalStateException("Full Queue!");
        if (isEmpty()) front++;
        q[(front + size) % q.length] = val; //ArrayOutOfBoundsException
        size++;
    }
    public int dequeue() throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException("Empty Queue!");
        int val = q[front];
        front = (front + 1) % q.length;
        size--;
        return val; 
    }
    public int first() {return q[front];}
    public int last() {return q[(front + (size - 1)) % q.length];}
}