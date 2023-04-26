public class Position <E> {
    E val;
    Position<E> prev, next;
    Position(E val) {
        this.val = val;
    }
    Position(E val, Position<E> prev, Position<E> next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}

