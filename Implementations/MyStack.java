public class MyStack {
    private int[] st;
    final static int CAPACITY = 10;
    private int size = 0;
    public MyStack() {this(CAPACITY);}
    public MyStack(int capacity) {st = new int[capacity];}
    public int size() {return size;}
    public boolean isEmpty() {return size == 0;}
    public int peek() {return (isEmpty())? -1 : st[size-1];}
    public void push(int val) {
        if (size == st.length) {
            int[] temp = new int[st.length * 2];
            System.arraycopy(st, 0, temp, 0, size);
            st = temp;
        }
        st[size++] = val;
    }
    public int pop() {return (isEmpty())? -1 : st[--size];}
}
