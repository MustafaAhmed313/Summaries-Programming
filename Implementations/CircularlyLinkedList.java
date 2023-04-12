public class CircularlyLinkedList <E> {
    private int size = 0;
    Node<E> tail = null;
    public CircularlyLinkedList() {}
    public int size(){return size;}
    public boolean isEmpty(){return size == 0;}
    public E first(){
        if (isEmpty()) return null;
        return tail.next.val;
    }
    public void rotate() {if (!isEmpty()) tail = tail.next;}
    public void addFirst(E val) {
        if (isEmpty()) {
            tail = new Node<>(val , null);
            tail.next = tail;
        }else {
            tail.next = new Node<>(val , tail.next);
        }
        size++;
    }
    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> node = tail.next;
        tail.next.next = node.next;
        size--;
        return node.val;
    }
}
