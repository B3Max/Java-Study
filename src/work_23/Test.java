package work_23;

public class Test {
    public static void main(String[] args) {
        FakeArrayList<Integer> test = new FakeArrayList<>();
        System.out.println(test);
        for (int i = 0; i < 12; i++) {
            test.add(i);
        }
        System.out.println(test);
        test.add(3, 6);
        System.out.println(test.get(3));
        System.out.println(test.get(13));
        System.out.println(test);
        System.out.println(test.indexOf(6));
        System.out.println(test.lastIndexOf(6));
        System.out.println(test.remove(test.indexOf(6)));
        System.out.println(test);
        System.out.println(test.set(13, 12));
        System.out.println(test.set(2, 11));
        System.out.println(test);
        System.out.println();

        FakeArrayList<Integer> test2 = new FakeArrayList<>();
        System.out.println(test2);
        System.out.println(test2.addAll(5, test));
        System.out.println(test2);
        System.out.println();

        FakeArrayList<Integer> test3 = new FakeArrayList<>(15);
        for (int i = 0; i < 5; i++) {
            test3.add(i + 1);
        }
        System.out.println(test3);
        System.out.println();

        FakeArrayList<Integer> test4 = new FakeArrayList<>(test3);
        System.out.println(test4);
        System.out.println(test4.addAll(5, test));
        System.out.println(test4);
        System.out.println();

        FakeArrayList<String> test5 = new FakeArrayList<>();
        test5.add("LULW");
        test5.add("LOLXDLL");
        test5.add("KEKW");
        test5.add("LMAO");
        test5.add("Cringe");
        test5.add("Flex");
        System.out.println(test5);
        test5.sort();
        System.out.println(test5);
        System.out.println(test5.subList(0, test5.indexOf("LMAO")));
    }
}
