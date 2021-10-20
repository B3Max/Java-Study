//package work_23;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Comparator;
//import java.util.List;
//
//public class FakeArrayList<E> {
//    private int capacity = 10;
//    private int size = 0;
//    private E[] array;
//
//    FakeArrayList() {
//        this.array = (E[]) new Object[10];
//    }
//
//    FakeArrayList(Collection <? extends E> col) {
//        Object[] a = col.toArray();
//        this.size = col.size();
//        this.array = (E[]) a;
//    }
//
//    FakeArrayList (int capacity) {
//        this.capacity = capacity;
//        this.array = (E[]) new Object[capacity];
//    }
//
//    public void resize(int size) {
//        this.array = Arrays.copyOf(array, size);
//    }
//
//    public void add(E obj) {
//        if (size >= capacity)
//            resize(size*2);
//        array[size++] = obj;
//    }
//
//    public void add(int index, E obj) {
//        if (size >= capacity)
//            resize(size*2);
//        System.arraycopy(array, index, array, index+1, size-index);
//        array[index] = obj;
//    }
//
//    public boolean addAll(int index, Collection<? extends E> col) {
//        Object[] a = col.toArray();
//
//    }
//
//    public E get(int index) {
//
//    }
//
//    public int indexOf(Object obj) {
//
//    }
//
//    public int lastIndexOf(Object obj) {
//
//    }
//
//    public E remove(int index) {
//
//    }
//
//    public E set(int index, E obj) {
//
//    }
//
//    public void sort(Comparator<? super E> comp) {
//
//    }
//
//    public List<E> subList(int start, int end) {
//
//    }
//}
