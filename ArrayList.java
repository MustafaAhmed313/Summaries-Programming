public class ArrayList {
    private Object[] objects;
    private int size;
    static final int CAPACITY = 10;
    ArrayList() {
        objects = new Object[CAPACITY];
        size = -1;
    }
    public boolean empty() {
        return size == -1;
    }
    public void add(Object e) {
        if (size >= objects.length - 1) {
            Object[] objects1 = new Object[size * 2];
            System.arraycopy(objects , 0 , objects1 , 0 , size);
            objects = objects1;
        }
        objects[++size] = e;
    }
    public void add(int index , Object e) {
        size++;
        if (size >= objects.length - 1) {
            Object[] objects1 = new Object[size * 2];
            System.arraycopy(objects , 0 , objects1 , 0 , size);
            objects = objects1;
        }
        for (int i = size ; i < index ; i--) {
            objects[i] = objects[i-1];
        }
        objects[index] = e;
    }
    public boolean contains(Object e) {
        for (int i = 0 ; i <= size ; i++)
            if (objects[i].equals(e))
                return true;
        return false;
    }
    public Object get(int index){
        return objects[index];
    }
    public boolean isEmpty() {
        return size == -1;
    }
    public boolean remove(Object e) {
        if (contains(e)) {
            for (int i = 0; i <= size; i++) {
                if (objects[i].equals(e)) {
                    if (i == size) {
                        size--;
                        return true;
                    }
                    for (int j = i + 1; j <= size; j++) {
                        objects[j - 1] = objects[j];
                    }
                    size--;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean remove(int index) {
        if (isEmpty())
            return false;
        else if (index == size) {
            size--;
            return true;
        }
        for (int j = index + 1; j <= size; j++) {
            objects[j - 1] = objects[j];
        }
        size--;
        return true;
    }
}
