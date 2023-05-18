import java.util.NoSuchElementException;
public class PositionList <E> {
    Position<E> head, tail;
    private int sz;
    public PositionList() {
        head = new Position<>(null, null, null);
        tail = new Position<>(null, head, null);
        head.next = tail;
        sz = 0;
    }
    public Position<E> first() {
        return head.next;
    }
    public Position<E> last() {
        return tail.prev;
    }
    public Position<E> before(Position<E> p) {
        return p.prev;
    }
    public Position<E> after(Position<E> p) {
        return p.next;
    }
    public int size() {
        return sz;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    private Position<E> addBetween(E value, Position<E> left, Position<E> right) {
        Position<E> newPosition = new Position<>(value, left, right);
        left.next = right.prev = newPosition;
        sz++;
        return newPosition;
    }
    public Position<E> addFirst(E value) {
        return addBetween(value, head, head.next);
    }
    public Position<E> addLast(E value) {
        return addBetween(value, tail.prev, tail);
    }
    public Position<E> addBefore(E value, Position<E> p) {
        return addBetween(value, p.prev, p);
    }
    public Position<E> addAfter(E value, Position<E> p) {
        return addBetween(value, p, p.next);
    }
    public E set(E value, Position<E> p) {
        E oldValue = p.val;
        p.val = value;
        return oldValue;
    }

    public E remove(Position<E> p) throws Exception {
        Position<E> cur = head.next;
        boolean exist = false;
        while (cur != tail) {
            if (cur == p) {
                exist = true;
                break;
            }
            cur = cur.next;
        }
        if (!exist) {
            throw new NoSuchElementException("No longer in the list!");
        }
        Position<E> tmp = p.prev;
        p.prev.next = p.next;
        p.next.prev = tmp;
        sz--;
        return p.val;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Position<E> cur = first();
        while (cur != tail) {
            sb.append(cur.val + ",");
            cur = cur.next;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}
