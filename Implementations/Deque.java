public class Deque {
    private int[] deq;
    private int front = -1 , rear = -1 , size = 0; 
    public Deque() {deq = new int[10];}
    public int size() {return size;}
    public boolean isEmpty() {return size == 0;}
    public int first() {return deq[front];}
    public int last() {return deq[rear];}
    public void addFirst(int val) throws IllegalStateException {
        if (isEmpty()) { // [1] - - - - - - -
            front++;
            rear++;
        }  
        else if (size == deq.length) {throw new IllegalStateException("Full Deque!");} // 1 2 3 4 5 6
        else {front = (front - 1 + deq.length) % deq.length;} /// 1 - - - - - 2
        deq[front] = val;
        size++;
    }
    public void addLast(int val) throws IllegalStateException {
        if (isEmpty()) {
            front++;
            rear++;
        }
        else if (size == deq.length) {throw new IllegalStateException("Full Deque!");}
        else {rear = (rear + 1) % deq.length;}
        deq[rear] = val;
        size++;
    }
    public int removeFirst() throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException("Empty Deque!");
        int val = deq[front];
        front = (front + 1) % deq.length;
        size--;
        return val;
    }
    public int removeLast() throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException("Empty Deque!");
        int val = deq[rear];
        rear = (rear - 1 + deq.length) % deq.length;
        size--;
        return val;
    }
}
