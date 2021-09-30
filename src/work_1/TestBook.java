package work_1;

public class TestBook {
    public static void main (String[] args) {
        Book b1 = new Book("The murder she wrote", 234, "killer is butler");
        Book b2 = new Book("Sherlock Holmes", 112);
        Book b3 = new Book("Test");
        Book b4 = new Book(23);
        Book b5 = new Book();
        System.out.println(b2);
        b2.setNumOfPage(121);
        System.out.println(b2.getName());
        b4.setName("Instructions");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b1.howLongToRead());
        System.out.println(b2.howLongToRead());
    }
}
