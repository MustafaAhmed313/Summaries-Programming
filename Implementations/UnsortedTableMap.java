import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UnsortedTableMap<K , V> extends MyAbstractMap<K , V> {
    private ArrayList<MyMapEntry<K , V>> table = new ArrayList<>();
    public UnsortedTableMap() {}
    private int findIndex(K k) {
        int n = table.size();
        for (int j = 0 ; j < n ; j++) 
            if (table.get(j).getKey().equals(k))
                return j;
        return -1;
    }
    @Override 
    public int size() {return table.size();}
    @Override
    public V get(K k) {
        int j = findIndex(k);
        if (j == -1) return null;
        return table.get(j).getValue();
    }
    @Override
    public V put(K k , V v) {
        int j = findIndex(k);
        if (j == -1) {
            table.add(new MyMapEntry<>(k , v));
            return null;
        }else return table.get(j).setValue(v);
    }
    @Override
    public V remove(K k) {
        int j = findIndex(k);
        if (j == -1) return null;
        V answer = table.get(j).getValue();
        table.remove(j);
        return answer;
    }
    private class EntryIterator implements Iterator<MyEntry<K , V>> {
        private int j = 0; 
        @Override
        public boolean hasNext() {return j < table.size();} 
        @Override
        public MyEntry<K, V> next()  {
            if (j == table.size()) throw new NoSuchElementException(); 
            return table.get(j++);
        }
    }
    private class EntryIterable implements Iterable<MyEntry<K , V>> {
        @Override
        public Iterator<MyEntry<K, V>> iterator() {return new EntryIterator();}
    }
    @Override
    public Iterable<MyEntry<K , V>> entrySet() {return new EntryIterable();} 
}
