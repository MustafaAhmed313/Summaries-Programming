import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        TestSinglyLinkedList();
        TestCircularlyLinkedList();
        TestDoublyLinkedList();
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