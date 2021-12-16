package work_13_14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws ParseException {
        System.out.print("Введите дату: "); // 12:12 23/11/2021

        Scanner scanner = new Scanner(System.in);
        String strDate = scanner.nextLine();

        Date date = new SimpleDateFormat("yyyy/MM/dd HH:mm").parse(strDate);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        System.out.println("Date: " + date);
        System.out.println("Calendar: " + calendar.getWeeksInWeekYear());
    }
}