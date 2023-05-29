public class MyPositionList<E> implements PositionList<E> {
    int size;
    Node<E> head;
    Node<E> tail;
    public MyPositionList(){
        size = 0;
        head = new Node<>(null, tail, null);
        tail = new Node<>(null , null , head);
    }
    private Node<E> validate(Position<E> p) throws IllegalArgumentException {
       if (p == null) throw new IllegalArgumentException("null position!");
       return (Node<E>) p; 
    }
    @Override
    public int size() {return size;}
    @Override
    public boolean isEmpty() {return size == 0;}
    @Override
    public Position<E> first() {return head.next;}
    @Override
    public Position<E> last() {return tail.prev;}
    @Override
    public Position<E> before(Position<E> p) {
        Node<E> n = validate(p);
        return n.prev;
    }
    @Override
    public Position<E> after(Position<E> p) {
        Node<E> n = validate(p);
        return n.next;
    }
    private Position<E> addBetween(E val , Position<E> p , Position<E> n) {
        Node<E> pred = validate(p); //prev
        Node<E> succ = validate(n); //next
        Node<E> N = new Node<>(val, succ, pred);
        succ.prev = N;
        pred.next = N;
        size++;
        return N;
    }
    @Override
    public Position<E> addFirst(E e) {return addBetween(e , head , head.next);}
    @Override
    public Position<E> addLast(E e) {return addBetween(e, tail.prev , tail);}
    @Override
    public Position<E> addBefore(E e, Position<E> p) {
        Node<E> n = (Node<E>)p;
        return addBetween(e , n.prev , n);
    }
    @Override
    public Position<E> addAfter(E e, Position<E> p) {
        Node<E> n = (Node<E>)p;
        return addBetween(e , n , n.next);   
    }

    @Override
    public E set(E e, Position<E> p) {
        Node<E> n = validate(p);
        E old = n.getElement();
        n.setVal(e);
        return old;
    }
    @Override
    public E remove(Position<E> p) {
        Node<E> N = validate(p);
        Node<E> pred = N.prev;
        Node<E> succ = N.next;
        E val = N.getElement();
        pred.next = succ;
        succ.prev = pred;
        N = null;
        return val;
    }
}
class Node<E> implements Position<E>{
    private E val;
    Node<E> next , prev;
    public Node(E val , Node<E> next , Node<E> prev) {
        this.next = next;
        this.prev = prev;
        this.val = val;
    }
    public void setVal(E val){this.val = val;}
    @Override
    public E getElement() {return val;}

}
interface Position<E> {E getElement();}
interface PositionList<E> {
    int size();
    boolean isEmpty();
    Position<E> first();
    Position<E> last();
    Position<E> before(Position<E> p);
    Position<E> after(Position<E> p);
    Position<E> addFirst(E e);
    Position<E> addLast(E e);
    Position<E> addBefore(E e , Position<E> p);
    Position<E> addAfter(E e , Position<E> p);
    E set(E e , Position<E> p);
    E remove(Position<E> p);
}
