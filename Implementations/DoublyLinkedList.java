public class DoublyLinkedList <T>{
    DuNode<T> head;
    DuNode<T> tail;
    private int size = 0;
    public DoublyLinkedList() {
        head = new DuNode<>(null , null , null);
        tail = new DuNode<>(null , null , head);
        head.next = tail;
    }
    public int size(){return size;}
    public boolean isEmpty(){return size == 0;}
    public T first(){
        if (isEmpty()) return null;
        return head.next.val;
    }
    public T last(){
        if (isEmpty()) return null;
        return tail.prev.val;
    }
    public void addFirst(T element) {
        if (isEmpty()) {
            DuNode<T> node = new DuNode<>(element , head.next , head);
            head.next = node;
            tail.prev = node;
        }else {
            DuNode<T> node = new DuNode<>(element , head.next , head);
            node.next.prev = node;
            node.prev.next = node;
        }
        size++;
    }
    public void addLast(T element) {
        if (isEmpty()) {
            DuNode<T> node = new DuNode<>(element , tail , tail.prev);
            tail.prev = node;
            head.next = node;
        }else {
            DuNode<T> node = new DuNode<>(element , tail , tail.prev);
            node.next.prev = node;
            node.prev.next = node;
        }
        size++;
    }
    public T removeFirst() {
        if (isEmpty()) return null;
        DuNode<T> node = head.next;
        node.next.prev = head;
        head.next = node.next;
        size--;
        return node.val;
    }
    public T removeLast() {
        if (isEmpty()) return null;
        DuNode<T> node = tail.prev;
        node.prev.next = tail;
        tail.prev = node.prev;
        size--;
        return node.val;
    }
}

