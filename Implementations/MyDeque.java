import java.util.Iterator;

public class MyDeque<E> implements Iterable<E> {
    private DuNode<E> head;
    private DuNode<E> tail;
    private int size;
    public MyDeque(){size = 0;}
    public void addFirst(E e) {
        if (isEmpty()) head = tail = new DuNode<>(e , null , null);
        else {
            DuNode<E> newHead = new DuNode<>(e , null , head);
            head.prev = newHead;
            head = newHead;
        }
        size++;
    }
    public void addLast(E e) {
        if (isEmpty()) head = tail = new DuNode<>(e , null , null);
        else {
            DuNode<E> newTail = new DuNode<>(e , tail , null);
            tail.next = newTail;
            tail = newTail;
        }
        size++;
    }
    public boolean isEmpty(){return size == 0;}
    public int size(){return size;}
    public class TailIterator implements Iterator<E> {
        int count = 0;
        DuNode<E> cur = tail;
        @Override
        public boolean hasNext() {return count != size();}
        @Override
        public E next() {
            if (!hasNext()) return null;
            E e = cur.val;
            cur = cur.prev;
            count++;
            return e;
        }
    }
    @Override
    public Iterator<E> iterator() {
        return new TailIterator();
    }
}
