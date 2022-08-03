package bt_arraylist;

import java.util.Arrays;

public class MyList<E> {
   private int size = 0;
   private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

   public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

   public MyList(int capacity) {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        }else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] ==null) {
//            elements[index] == element;
            size++;

        }else {
            for (int i = size+1; i >= index; i--) {
                elements[i] = elements[i-1];

            }
            elements[index] = element;
            size++;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index" + index + "out of bonunds");
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E temp = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[index + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) ;
            return true;
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public boolean add(E element) {
       if (elements.length == size) {
           this.ensureCapacity(5);
       }
       elements[size] = element;
       size++;
        return false;
    }

    public void ensureCapacity(int minCapasity) {
       if (minCapasity >= 0) {
           int newSize = this.elements.length + minCapasity;
           elements = Arrays.copyOf(elements, newSize);
       }else {
           throw new IllegalArgumentException("minCapasity: " + minCapasity);
       }

    }

    public int lastIndexOf(E e) {
        for (int i = size; i < size; i--) {
            if (e.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index : " + index + ",size : " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public void printMyList() {
        int i = 0;
        for (E e : (E[]) elements) {
            System.out.println("Element " + i +" : " + e);
            i++;
        }
    }

}
