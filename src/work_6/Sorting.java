package work_6;

import java.util.Arrays;

public class Sorting extends Student {
    public Sorting(int age, String name, int grade) {
        super(age, name, grade);
    }

    public static Student[] mergesort(Student[] array) {
        if (array.length <= 1)
            return array;
        Student[] buffer1 = Arrays.copyOf(array, array.length / 2);
        Student[] buffer2 = Arrays.copyOfRange(array, array.length / 2, array.length);
        return mergesortInner(buffer1, buffer2);
    }

    public static Student[] mergesortInner(Student[] buffer1, Student[] buffer2) {

        Student[] sorted1 = mergesort(buffer1);
        Student[] sorted2 = mergesort(buffer2);
        Student[] result = new Student[sorted1.length + sorted2.length];

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
}
