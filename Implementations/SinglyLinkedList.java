public class SinglyLinkedList <E> {
    private int size = 0;
    Node<E> head = null;
    Node<E> tail = null;
    public SinglyLinkedList() {}
    public int size(){return size;}
    public boolean isEmpty(){return size == 0;}
    public E first(){
        if (isEmpty()) return null;
        return head.val;
    }
    public E last(){
        if (isEmpty()) return null;
        return tail.val;
    }
    public void addFirst(E val) {
        head = new Node<>(val , head);
        if (isEmpty()) tail = head;
        size++;
    }
    public void addLast(E val) {
        Node<E> node = new Node<>(val , null);
        if (isEmpty()) head = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> node = head;
        head = head.next;
        size--;
        return node.val;
    }
}
