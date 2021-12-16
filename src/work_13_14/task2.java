package work_13_14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws ParseException {
        System.out.print("Введите дату: "); // 23/11/2021

        Scanner scanner = new Scanner(System.in);

        String strDate = scanner.nextLine();

        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
        Date curDate = new Date();

        System.out.println("Текущая дата " + (curDate.after(date) ? "позже" : "раньше") + " введенной");
    }
}