//package work_26;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
////2. Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
//
//public class MyArrayList<Object> {
//    private Object[] l;
//    private int count;
//    private int size;
//
//    public MyArrayList() {
//        this(8);
//    }
//
//    public MyArrayList(int size) {
//        this.size = size;
//        l = new Object[size];
//        count = 0;
//    }
//
//    public MyArrayList(MyArrayList<Object> other) {
//        this.count = other.count;
//        this.size = other.size;
//        this.l = new Object[size];
//        System.arraycopy(other.l, 0, l, 0, count);
//    }
//
//    public void add(Object o) {
//        if (size - count == 1) resize(size * 2);
//        l[count++] = o;
//    }
//
//    public void add(Object o, int index) {
//        if (size - count == 1) resize(size * 2);
//        System.arraycopy(l, index, l, index + 1, count - index);
//        l[index] = o;
//    }
//
//    public boolean addAll(int index, MyArrayList<Object> other) {
//        if (other.count == 0) return false;
//
//        int newSize = size;
//        while (newSize - count <= other.count) newSize *= 2;
//        resize(newSize);
//        System.arraycopy(l, index, l, index + other.count, count - index);
//        System.arraycopy(other.l, 0, l, index, other.count);
//        count += other.count;
//
//        return true;
//    }
//
//    public int indexOf(Object o) {
//        for (int i = 0; i < count; i++)
//            if (l[i].equals(o)) return i;
//        return -1;
//    }
//
//    public int lastIndexOf(Object o) {
//        for (int i = count - 1; i >= 0; i--)
//            if (l[i].equals(o)) return i;
//        return -1;
//    }
//
//
//    public void sort(Comparator<Object> comp) {
//        //Arrays.sort(l, comp); // java.lang.NullPointerException
//        for (int i = 1; i < count; i++) {
//            boolean ch = false;
//            for (int j = count - 1; j > i; j--) {
//                if (comp.compare(l[j], l[j - 1]) < 0) {
//                    Object tmp = l[j];
//                    l[j] = l[j - 1];
//                    l[j - 1] = tmp;
//                    ch = true;
//                }
//            }
//            if (!ch) break;
//        }
//    }
//
//    public MyArrayList<Object> subList(int start, int end) {
//        MyArrayList<Object> nl = new MyArrayList<>();
//        for (int i = start; i < end; i++) nl.add(l[i]);
//        return nl;
//    }
//
//    public void set(int index, Object o) {
//        l[index] = o;
//    }
//
//    public Object remove(int index) {
//        if (index > count)
//            throw new IndexOutOfBoundsException();
//        Object o = l[index];
//        System.arraycopy(l, index + 1, l, index, count - index - 1);
//        l[--count] = null;
//
//        if (count < size / 2) resize(size / 2);
//        return o;
//    }
//
//
//    private void resize(int nSize) {
//        if (nSize > size)
//            l = Arrays.copyOf(l, nSize);
//        else {
//            Object[] tmp = new Object[nSize];
//            System.arraycopy(l, 0, tmp, 0, nSize);
//            l = tmp;
//        }
//        size = nSize;
//
//    }
//
//    public Object get(int index) {
//        if (index > count)
//            throw new IndexOutOfBoundsException();
//        return l[index];
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    @Override
//    public String toString() {
//        return "MyArrayList{" +
//                "l=" + Arrays.toString(l) +
//                ", count=" + count +
//                ", size=" + size +
//                '}';
//    }
//
//}