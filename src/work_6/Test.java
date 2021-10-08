package work_6;

public class Test {
    public static void main(String[] args) {
        Student[] s1 = new Student[] {
                new Student(16, "Antony", 8),
                new Student(23, "Stanislaw", 0),
                new Student(8, "Giorgio", 3),
                new Student(3, "Kirill", 0),
                new Student(10, "Max", 5),
        };
        Student[] s2 = new Student[] {
                new Student(7, "Name1", 1),
                new Student(11, "Name2", 2),
                new Student(2, "Name3", 3),
                new Student(6, "Name4", 4),
                new Student(59, "Name5", 5),
        };
        for (Student res : s1) {
            System.out.println(res);
        }
        for (Student res : s2) {
            System.out.println(res);
        }
        System.out.println();
        Student[] r = Sorting.mergesortInner(s1, s2);
        for (Student res : r) {
            System.out.println(res);
        }
    }
}
