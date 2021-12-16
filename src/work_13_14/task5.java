package work_13_14;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class task5 {
    public static void main(String[] args) {

        // INSERT TESTS //
        ArrayList<Integer> arrList = new ArrayList(10000);
        Date arrayInsertStart = new Date();
        for (int i = 0; i < 10000; i++) {
            arrList.add(i * i);
        }
        Date arrayInsertEnd = new Date();
        System.out.println("ArrayList set time " + (arrayInsertEnd.getTime() - arrayInsertStart.getTime()) + " ms");
        LinkedList<Integer> linkedList = new LinkedList();
        Date linkedInsertStart = new Date();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i * i);
        }
        Date linkedInsertEnd = new Date();
        System.out.println("LinkedList set time " + (linkedInsertEnd.getTime() - linkedInsertStart.getTime()) + " ms");

        // SEARCH TESTS //
        Date arrFindStart = new Date();
        Integer result1 = arrList.stream().filter(elem -> elem == 622521).findAny().orElse(null);
        Date arrFindEnd = new Date();
        System.out.println("ArrayList search time " + (arrFindEnd.getTime() - arrFindStart.getTime()) + " ms");
        Date listFindStart = new Date();
        Integer result2 = linkedList.stream().filter(elem -> elem == 622521).findAny().orElse(null);
        Date listFindEnd = new Date();
        System.out.println("LinkedList search time " + (listFindEnd.getTime() - listFindStart.getTime()) + " ms");

        // DELETE TESTS //
        Date arrayDeleteStart = new Date();
        for (int i = 0; i < arrList.size(); i += 0) {
            arrList.remove(i);
        }
        Date arrayDeleteEnd = new Date();
        System.out.println("ArrayList delete time " + (arrayDeleteEnd.getTime() - arrayDeleteStart.getTime()) + " ms");
        Date linkedDeleteStart = new Date();
        while (linkedList.size() > 0) {
            linkedList.remove();
        }
        Date linkedDeleteEnd = new Date();
        System.out.println("LinkedList delete time " + (linkedDeleteEnd.getTime() - linkedDeleteStart.getTime()) + " ms");
    }
}
