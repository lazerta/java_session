package datastructure;

public interface MyList<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    boolean add(E e);
    public boolean remove(Object o);
    public void clear();
    public E get(int index);
    public E set(int index, E element);
    public void add(int index, E element);
    public E remove(int index);
    public int indexOf(Object o);
    public int lastIndexOf(Object o);
}
