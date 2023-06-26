import java.util.*;

public interface MyMap<K , V> {
    int size();
    boolean isEmpty();
    V remove(K k);
    V put(K k , V v);
    V get(K K);
    Iterable<MyEntry<K , V>> entrySet();
}
