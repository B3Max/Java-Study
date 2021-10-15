package work_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("123");
        arr.add("456");

        WaitList<String> w = new WaitList<>();
        w.add("Hi!");
        w.add("Hello");
        w.add("What's up");
        w.add("123");
        w.add("456");
        System.out.println(w);
        System.out.println(w.remove());
        System.out.println(w);
        System.out.println(w.isEmpty());
        System.out.println(w.contains("Hi"));
        System.out.println(w.contains("123"));
        System.out.println(w.containsAll(arr));
        w = new WaitList<>(arr);
        System.out.println(w);

        BoundedWaitList<String> b = new BoundedWaitList<>(3);
        b.add("f");
        b.add("g");
        b.add("h");
        System.out.println(b);
        try {
            b.add("4");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(b);
        System.out.println(b.getCapacity());
        b = new BoundedWaitList<>(2);
        b.add("1");
        b.add("2");
        System.out.println(b.getCapacity());
        try {
            b.add("4");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(b);

        UnfairWaitList<Integer> u = new UnfairWaitList<>();
        u.add(1);
        u.add(2);
        u.add(3);
        u.add(4);
        u.add(5);
        u.add(6);
        System.out.println(u);
        u.remove(5);
        System.out.println(u);
        u.remove(2);
        System.out.println(u);
        u.moveToBack(3);
        System.out.println(u);
    }
}
