package work_26;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Main {
    // 1. Написать метод для конвертации массива строк/чисел в список.
    public static <E> ArrayList<E> arrayToList(E[] arr){
        if(arr == null)
            throw new IllegalArgumentException("Null array!");
        ArrayList<E> l = new ArrayList<>(arr.length);
        Collections.addAll(l, arr);
        return l;
    }

    // 3. Реализовать метод, который возвращает любой элемент массива по индексу.
    public static <E> E get(E[] arr, int index){
        if (index < 0 || index >= arr.length)
            throw new IndexOutOfBoundsException("Array size = "+ arr.length+", index = "+index);
        return arr[index];
    }

    // 4. Написать функцию, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.
    public static ArrayList<File> readDir(String path){
        File f = new File(path);

        if (!f.exists() || !f.isDirectory())
            throw new IllegalArgumentException("Not correct path!");

        ArrayList<File> lf = new ArrayList<>();

        Collections.addAll(lf, Objects.requireNonNull(f.listFiles()));
        try {
            for (int i = 0; i < 5; i++)
                System.out.println(lf.get(i).getName());
        } catch (Exception e) {
            System.out.println("Files in the directory is less than 5!");
        }
        return lf;
    }

    // MAIN
    public static void main(String[] args) {
        //test1
        System.out.println("TEST 1");
        String[] a = new String[]{"Hello", "world", "!"};
        ArrayList<String> l = arrayToList(a);
        System.out.println(l);
        System.out.println();

        //test2
        System.out.println("TEST 2");
        MyArrayList<Integer> ints = new MyArrayList<>(8);
        for(int i = 0; i<20;i++)
            ints.add(i);
        System.out.println(ints);
        for(int i = 5; i < 13; i++)
            ints.remove(i);
        System.out.println(ints);
        System.out.println(ints.get(5));
        System.out.println();

        MyArrayList<String> strings = new MyArrayList<>();
        System.out.println(strings);
        for (int i = 0; i < 10; i++) {
            strings.add("String number " + (i+1));
        }
        System.out.println(strings);
        System.out.println();

        MyArrayList<String> strings2 = new MyArrayList<>(strings);
        System.out.println(strings2);
        strings2.remove(5);
        System.out.println(strings2.get(5));
        System.out.println(strings.get(5));
        strings2.addAll(strings2.getCount(), strings.subList(4, 8));
        System.out.println(strings2);
        strings2.sort(String::compareTo);
        System.out.println(strings2);
        System.out.println();

        // test3
        System.out.println("TEST 3");
        System.out.println(get(a, 0));
        System.out.println(get(a, 2));
        System.out.println();

        // test4
        System.out.println("TEST 4");
        ArrayList<File> lf = readDir(Paths.get("").toAbsolutePath().toString());
        System.out.println();
        System.out.println(lf);
        System.out.println();
    }
}
