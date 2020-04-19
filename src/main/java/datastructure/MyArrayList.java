package datastructure;


import java.util.*;

// idea of arrayList
/*
 We create an array. when performance different operation
 if the capacity is full, we create a new array then copy the content of old array to the new array
  size is number of elements in the List.a
 */
public class MyArrayList<E> implements MyList<E> {
    private int CAPACITY = 16;
    private int size = 0;
    private E[] array;

    public MyArrayList(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        array = (E[]) new Object[CAPACITY];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
        // for (E element : array) {
        //     if (element.equals(o)){
        //         return  true;
        //     }
        // }
        // return false;
    }

    @Override
    //O(1) +O(n)
    public boolean add(E e) {
        //
        // run n times = n *1 = N
        // total cost of adding n element is

        // add(1) 1
        //add(2)1
        //add(3)1
        // total time spend for adding n elements is 2n
        // how much time for adding each element on average ?
        //  Answer: 2n/n = 2
        // So we conclude add operation is a constant time
        //O(1)

        // Only Run when we added N  elements
        ensureCapacity();

        array[size++] = e;
        return true;
    }

    private void ensureCapacity() {

        //  if  size = capacity
        if (size  == CAPACITY -1) {
            //O(N)
            //    double it capacity
            CAPACITY = CAPACITY * 2;
            //    create a new array of the capacity
            E[] newArray = (E[]) new Object[CAPACITY];
            //    copy everything from the old to new;
            System.arraycopy(array, 0, newArray, 0, array.length);
            // make old reference  point to new array
            array = newArray;
        }


    }

    @Override
    //O(N)
    public boolean remove(Object o) {
        // find the index of the element.
        int index = indexOf(o);
        //  if element does not exist(index == -1); do nothing return false
        if (index == -1) return false;
        // element exist. Check if remove last element
        if (index == size - 1) {
            // remove at the end
            array[index] = null;
            size--;
            return true;
        }

        //  remove in middle or the beginning
        // shift element to the left by one index
        //staring  the removing index


        // 3,8,9,42,7,5,12
        // remove 42, index = 3;
        /*
          i = 3;
          array[3] = array[4]
          3,8,9,7,7,5,12
         */

        /*
          i = 4;
          array[4] = array[5]
          3,8,9,7,5,5,12
         */

        /*
          i = 5;
          array[5] = array[6]
          3,8,9,7,5,12,12
         */
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size-1] = null;
        //    3,8,9,7,5,12,null
        size--;
        //    3,8,9,7,5,12,
        return true;

        // remove elem

    }

    @Override
    public void clear() {
         size = 0;
    }

    @Override
    public E get(int index) {
        //O(1) Constance Time
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        // we have return the old value
        //O(1)
        E result = get(index);
        array[index] = element;
        return result;
    }

    @Override
    public void add(int index, E element) {
        //o(n)
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index + " is out of bound");
        }
         ensureCapacity();
        //    add in the front and middle same case
        // shift element to next index.
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = element;
        size++;

        //    add the the end
        if (index == size ){
            add(element);
        }


    }

    @Override
    public E remove(int index) {
        // you return removed element

        E element = null;

        if (index < 0 || index >= size) throw new IndexOutOfBoundsException(index + "");
        // element exist. Check if remove last element
        if (index == size - 1) {
            // remove at the end
            element = array[index];
            array[index] = null;
            size--;

        }
        return  element;
    }

    @Override
    public int indexOf(Object o) {
        //O(n) big oh
        // average case  theta
        //100n + 900n^2 = O(N^2)
        // best  case oh mega
        //if can't find the object return -1;
        for (int i = 0; i < array.length; i++) {
                if (array[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
