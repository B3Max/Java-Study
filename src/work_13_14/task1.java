package work_13_14;

import java.util.Date;
import java.util.Scanner;

class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свою фамилию ");
        String surname = scanner.nextLine();
        System.out.println("Дата и время получения задания: Tue Nov 23 17:21:39 MSK 2021");
        Date date = new Date();
        System.out.println("Фамилия: " + surname);
        System.out.println("Время сдачи задания: " + date);
    }
}