package Homework_11.homework;
import java.util.Arrays;

public class myOwnCollection<E>  {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public myOwnCollection() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public myOwnCollection(int initialCapacity) {
           if (initialCapacity < 0)
                   throw new IllegalStateException("Illegal Capacity: " + initialCapacity);
        this.elements = new Object[initialCapacity];
    }


    public int size() {
        return size;
    }


    public void add(E element) {
        increaseCapacity(size + 1);
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void remove(E element) {
        int index = indexOf(element);
        if (index >= 0) {
            remove(index);
        }
    }

    @SuppressWarnings("unchecked")
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

    private void increaseCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}