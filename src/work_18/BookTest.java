package work_18;/*
3. Создать класс, описывающий книгу (Work_1.Book). В классе должны быть
описаны нужные свойства книги(автор, название, год написания и т.
        д.)и методы для получения, изменения этих свойств. Протестировать
работу класса в классе Work_19.BookTest, содержащим метод статический
main(String[] args).
*/

public class BookTest {
    public  static void main (String [] args) {
        //System.out.println(18 % 3);  // 0 = 3

        Book2 b1 = new Book2();
        Book2 b2 = new Book2("Me", "History", 2009, 47);

        System.out.println(b1);
        System.out.println(b2);
    }
}
