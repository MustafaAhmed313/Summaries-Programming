import java.util.*;
public abstract class MyAbstractMap<K , V> implements MyMap<K , V> {
    private int size;
    protected class MyMapEntry<K , V> implements MyEntry<K , V> {
        private K key;
        private V value;
        public MyMapEntry(K k , V v) {key = k; value = v;}
        @Override
        public void setKey(K k) {key = k;}
        @Override
        public V setValue(V v) {
            V old = value;
            value = v;
            return old;
        }
        @Override
        public K getKey() {return key;}
        @Override
        public V getValue() {return value;}
    }
    @Override
    public boolean isEmpty() {return size == 0;}
}
