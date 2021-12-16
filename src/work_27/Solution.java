package work_27;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static <E> HashSet<E> arrayToHashSet(E[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("Null array!");
        HashSet<E> s = new HashSet<>(arr.length);
        Collections.addAll(s, arr);
        return s;
    }

    public static <K, V> HashMap<K, V> arrayToHashMap(K[] arr, V[] vArr) {
        if (arr == null || vArr == null)
            throw new IllegalArgumentException("Null array!");
        if (vArr.length < arr.length)
            throw new IllegalArgumentException("Массив значений меньше массива ключей!");
        HashMap<K, V> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], vArr[i]);
        }
        return m;
    }

    public static void main(String[] args) {
        String[] a = new String[]{"Hello", "world", "!"};
        HashSet<String> hs = arrayToHashSet(a);
        System.out.println(hs);

        HashMap<String, String> m = arrayToHashMap(a, new String[]{"H", "w", "!"});
        System.out.println(m);
    }
}