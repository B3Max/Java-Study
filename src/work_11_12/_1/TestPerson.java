package work_11_12._1;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Max", "Osp");
        System.out.println(person.getName());
        Person person2 = new Person("Max");
        System.out.println(person2.getName());
    }
}
