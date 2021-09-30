package work_1;

import java.lang.*;
public class Book {
    private String Name = "None" , TheEnd = "Unknown";
    private int NumOfPage = 0;

    public Book () {}

    public Book (String name, int num, String end){
        this.Name = name;
        this.NumOfPage = num;
        this.TheEnd = end;
    }

    public Book (String name, int num) {
        this.Name = name;
        this.NumOfPage = num;
    }

    public Book (String name) {
        this.Name = name;
    }

    public Book (int num) {
        this.NumOfPage = num;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setNumOfPage(int num) {
        this.NumOfPage = num;
    }

    public void setTheEnd(String end) {
        this.TheEnd = end;
    }

    public String getName() {
        return Name;
    }
    public int getNumOfPage() {
        return NumOfPage;
    }
    public String getTheEnd() {
        return TheEnd;
    }

    public String toString() {
        return this.Name + ", Pages: " + NumOfPage + ", The ending is: " + this.TheEnd;
    }

    public String howLongToRead() {
        return ("You will read this book with " + NumOfPage + " pages " + NumOfPage*3/2 + " minutes");
    }
}


