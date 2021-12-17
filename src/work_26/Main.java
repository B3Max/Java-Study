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
        String[] arr = new String[]{"1", "2", "3", "4", "5"};
        task2 <Object> strs = new task2<>();
        strs.setArr(arr);
        System.out.println(strs.getIndex(2));

        Integer[] arr2 = new Integer[]{5, 4, 3, 2, 1};
        task2 <Object> ints = new task2<>();
        ints.setArr(arr2);
        System.out.println(ints.getIndex(1));
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
