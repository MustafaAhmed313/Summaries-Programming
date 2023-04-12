public class DuNode <E> {
    E val;
    DuNode<E> next;
    DuNode<E> prev;
    public DuNode(E val , DuNode<E> next , DuNode<E> prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
