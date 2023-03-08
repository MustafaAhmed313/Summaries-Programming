public class MyDoublyLinkedList<T> {
    MyNode<T> head;
    MyNode<T> tail;
    private int size;
    public MyDoublyLinkedList() {
        head = new MyNode<>(null);
        tail = new MyNode<>(null);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    public int size(){return size;}
    public boolean isEmpty(){return size == 0;}
    public T first(){return head.next.val;}
    public T last(){return tail.prev.val;}
    public void addFirst(T element) {
        MyNode<T> newest = new MyNode<>(element);
        newest.prev = head;
        newest.next = head.next;
        head.next.prev = newest;
        head.next = newest;
        size++;
    }
    public void addLast(T element) {
        MyNode<T> newest = new MyNode<>(element);
        newest.next = tail;
        newest.prev = tail.prev;
        tail.prev.next = newest;
        tail.prev = newest;
        size++;
    }
    public T removeFirst() {
        MyNode<T> temp = head.next;
        head.next = temp.next;
        head.next.prev = head;
        size--;
        return temp.val;
    }
    public T removeLast() {
        MyNode<T> temp = tail.prev;
        tail.prev = temp.prev;
        tail.prev.next = tail;
        size--;
        return temp.val;
    }
    public static void main(String[] args) {
        MyDoublyLinkedList<Integer> list = new MyDoublyLinkedList<>();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addLast(2);
        list.addLast(1);
        list.addLast(0);
        list.removeFirst();
        list.removeLast();
        MyNode<Integer> current = list.head.next;
        while (current != list.tail) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.first());
        System.out.println(list.last());
    }
}
class MyNode<T> {
    MyNode<T> next;
    MyNode<T> prev;
    T val;
    public MyNode (T val) {
        this.val = val;
    }
}
