package work_18;/*
3. Создать класс, описывающий книгу (Work_1.Book). В классе должны быть
описаны нужные свойства книги(автор, название, год написания и т.
        д.)и методы для получения, изменения этих свойств. Протестировать
работу класса в классе Work_19.BookTest, содержащим метод статический
main(String[] args).
*/

public class Book2 {
    private String author = "Unknown" , name = "None";
    private int yearOfWriting = 0, id = 0;

    public Book2() {}

    public Book2(String author, String name, int year, int id){
        this.author = author;
        this.name = name;
        this.yearOfWriting = year;
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYearOfWriting(int year) {
        this.yearOfWriting = year;
    }
    public void setID(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getYearOfWriting() {
        return yearOfWriting;
    }
    public int getID() {
        return id;
    }

    public String toString() {
        return "Author: " + this.author + ", Name of the book: " + this.name + ", Year of writing: " + this.yearOfWriting + ", ID: " + this.id + ".";
    }
}


