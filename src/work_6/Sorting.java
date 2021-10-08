package work_6;

import java.lang.Comparable;
import java.util.Arrays;

public class Sorting implements Comparable {
    public static Comparable[] mergesort(Comparable[] array) {
        if (array.length <= 1)
            return array;
        Comparable[] buffer1 = Arrays.copyOf(array, array.length / 2);
        Comparable[] buffer2 = Arrays.copyOfRange(array, array.length / 2, array.length);
        return mergesortInner(buffer1, buffer2);
    }

    public static Comparable[] mergesortInner(Comparable[] buffer1, Comparable[] buffer2) {

        Comparable[] sorted1 = mergesort(buffer1);
        Comparable[] sorted2 = mergesort(buffer2);
        Comparable[] result = new Comparable[sorted1.length + sorted2.length];

        int index1 = 0, index2 = 0, resIndex = 0;
        while (index1 < sorted1.length && index2 < sorted2.length) {
            if (sorted1[index1].compareTo(sorted2[index2]) < 0)
                result[resIndex++] = sorted1[index1++];
            else result[resIndex++] = sorted2[index2++];
        }
        while (index1 < sorted1.length) {
            result[resIndex++] = sorted1[index1++];
        }
        while (index2 < sorted2.length) {
            result[resIndex++] = sorted2[index2++];
        }
        return result;
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
