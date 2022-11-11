public class Stack {
    private Object[] objects;
    private int size;
    static final int CAPACITY = 10;
    Stack() {
        objects = new Object[CAPACITY];
        size = -1;
    }
    public boolean empty() {
        return size == -1;
    }
    public void push(Object e) {
        if (size >= objects.length - 1) {
            Object[] objects1 = new Object[size * 2];
            System.arraycopy(objects , 0 , objects1 , 0 , size);
            objects = objects1;
        }
        objects[++size] = e;
    }
    public Object pop() {
        if (empty())
            return null;
        return objects[size--];
    }
    public Object peek(){
        return objects[size];
    }
    public int search(Object e) {
        for (int i = size ; i >= 0 ; i--)
            if (objects[i].equals(e))
                return i;
        return -1;
    }
}

