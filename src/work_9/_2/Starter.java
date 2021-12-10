package work_9._2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("ФИО", 67, 11, 17));
        s.add(new Student("ФИО2", 57, 8, 18));
        s.add(new Student("ФИО3", 93, 8, 19));
        s.add(new Student("ФИО4", 24, 3, 16));
        s.add(new Student("ФИО5", 66, 6, 15));

        new LabClassUI(s);
    }

}
