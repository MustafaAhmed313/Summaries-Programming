import java.util.*;

public abstract class MyAbtsractHashMap<K , V> extends MyAbstractMap<K , V> {
    protected int n = 0;
    protected int capacity;
    private int prime;
    private long scale, shift;
    public MyAbtsractHashMap(int cap, int p) {
        prime = p;
        capacity = cap;
        Random rand = new Random();
        scale = rand.nextInt(p - 1) + 1;
        shift = rand.nextInt(p);
        createTable();
    }
    public MyAbtsractHashMap(int cap) {this(cap, 109345121);}
    public MyAbtsractHashMap() {this(17);}
    @Override
    public int size() {return n;}
    @Override
    public V remove(K k) {return bucketRemove(hashValue(k) , k);}
    @Override
    public V put(K k, V v) {
        V answer = bucketPut(hashValue(k), k, v);
        if (n > capacity / 2) resize(2 * capacity - 1);
        return answer;
    }
    @Override
    public V get(K k) {return bucketGet(hashValue(k), k);}
    private int hashValue(K k) {
        return (int) ((Math.abs(k.hashCode() * scale + shift) % prime) % capacity);
    }
    private void resize(int newCap) {
        ArrayList<MyEntry<K , V>> buffer = new ArrayList<>(n);
        for (MyEntry<K , V> e : entrySet()) buffer.add(e);
        capacity = newCap;
        createTable();
        n = 0;
        for (MyEntry<K , V> e : entrySet()) put(e.getKey() , e.getValue());
    }
    protected abstract void createTable();
    protected abstract V bucketGet(int h , K k);
    protected abstract V bucketPut(int h , K k , V v);
    protected abstract V bucketRemove(int h , K k);
}
