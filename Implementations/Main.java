import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        TestSinglyLinkedList();
        TestCircularlyLinkedList();
        TestDoublyLinkedList();
        TestCircularQueue();
        TestDeque();
        TestArrayList();
    }
    public static void TestArrayList() {
        MyArrayList<Integer> a = new MyArrayList<>();
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        for (var e : a)
            if (e != null) System.out.print(e + " ");
    }
    public static void TestDeque() {
        MyDeque<Integer> d = new MyDeque<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        d.addFirst(5);
        d.addFirst(6);
        for (var e : d) System.out.print(e + " ");
    }
    public static void TestCircularQueue() {
        CircularQueue queue = new CircularQueue(3);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println(queue.Rear());
        queue.isFull();
        queue.deQueue();
        queue.enQueue(4);
        System.out.println(queue.Rear());
    }
    public static void TestDoublyLinkedList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        //add elements
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(50);
        list.addLast(60);
        DuNode<Integer> current = list.head.next;
        while (current != list.tail) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
    }
    public static void TestCircularlyLinkedList() {
        CircularlyLinkedList<Integer> list = new CircularlyLinkedList<>();
        //add elements
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(50);
        list.addFirst(60);
        Node<Integer> current = list.tail;
        list.rotate();
        while (current != list.tail) {
            System.out.print(list.tail.val + " ");
            list.rotate();
        }
        System.out.println();
        System.out.println(list.removeFirst());
    }
    public static void TestSinglyLinkedList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addFirst(50);
        list.addLast(60);
        Node<Integer> current = list.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println(list.removeFirst());
        current = list.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println(list.removeFirst());
    }
}