package work_6;

import java.lang.Comparable;

public class Test {
    public static void main(String[] args) {
        Comparable[] array1 = new Comparable[]{2, 4, 15, 14, 12, 6, 7, 19, 3, 1};
        Comparable[] array2 = new Comparable[]{18, 5, 234, 657, 673, 123, 45645, 45615, 612, 20, 16, 17, 8, 9, 10, 83, 11};
        //Comparable[] result = Sorting.mergesort(array1);
        Comparable[] result = Sorting.mergesortInner(array1, array2);
        for (Comparable index : result) {
            System.out.print(index + ", ");
        }
    }
}
