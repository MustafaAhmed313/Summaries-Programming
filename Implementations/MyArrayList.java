import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E>{
    private E[] array;
    private int size;
    public MyArrayList() {
        array = (E[]) new Object[10]; //[3 , 1 , 4 , 5 , 6 , 7 , null , null , null , null]
        size = 0; //6
    }
    public int size(){return size;}
    public boolean isEmpty(){return size == 0;}
    public void add(E val) {
        if (size == array.length) throw new IllegalStateException("Full Array!");
        array[size++] = val;
    }
    public class MyArrayListIterator implements Iterator<E> {
        int i = size() - 1;
        @Override
        public boolean hasNext() {return i > -1;}
        @Override
        public E next() {
            if (hasNext()) return array[i--];
            return null;
        }
    }
    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }
}
