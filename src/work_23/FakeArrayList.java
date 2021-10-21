package work_23;

import java.util.Arrays;

public class FakeArrayList<E> {
    private int capacity = 10;
    private int size = 0;
    private E[] array;

    FakeArrayList() {
        this.array = (E[]) new Object[10];
    }

    FakeArrayList(FakeArrayList<? extends E> col) {
        this.size = col.size;
        this.capacity = col.capacity;
        this.array = col.array;
    }

    FakeArrayList(int capacity) {
        this.capacity = capacity;
        this.array = (E[]) new Object[capacity];
    }

    public void resize(int size) {
        this.array = Arrays.copyOf(array, size);
        this.capacity = size;
    }

    public void add(E obj) {
        if (size >= capacity)
            resize(size * 2);
        array[size++] = obj;
    }

    public void add(int index, E obj) {
        if (size >= capacity)
            resize(size * 2);
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = obj;
        size++;
    }

    public boolean addAll(int index, FakeArrayList<? extends E> col) {
        if (col.size < 1 || size < index)
            return false;
        else {
            if (size + col.size >= capacity)
                resize(capacity * 2);
            System.arraycopy(array, index, array, index + col.size, size - index);
            System.arraycopy(col.array, 0, array, index, col.size);
            size += col.size;
            return true;
        }
    }

    public E get(int index) {
        if (index < size)
            return array[index];
        else return null;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++)
            if (array[i] == obj)
                return i;
        return -1;
    }

    public int lastIndexOf(Object obj) {
        int index = -1;
        for (int i = 0; i < size; i++)
            if (array[i] == obj)
                index = i;
        return index;
    }

    public E remove(int index) {
        if (index > size) return null;
        E element = array[index];
        System.arraycopy(array, index + 1, array, index, --size);
        return element;
    }

    public E set(int index, E obj) {
        if (index > size) return null;
        E element = array[index];
        this.array[index] = obj;
        return element;
    }

    public void sort() {
        Arrays.sort(array, 0, size);
    }

    public FakeArrayList<E> subList(int start, int end) {
        FakeArrayList<E> newList = new FakeArrayList<>();
        for (int i = start; i <= end; i++)
            newList.add(array[i]);
        return newList;
    }


    @Override
    public String toString() {
        return "FakeArrayList{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
