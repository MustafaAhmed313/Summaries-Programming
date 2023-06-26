public interface MyEntry<K , V> {
    void setKey(K k);
    V setValue(V v);
    K getKey();
    V getValue();
}
