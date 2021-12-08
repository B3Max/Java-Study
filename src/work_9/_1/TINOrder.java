package work_9._1;

import java.util.Scanner;

public class TINOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String tin = scanner.nextLine();
            if (tinTry(tin))
                System.out.println("Заказ подтвержден");
        } catch (TINNotValidException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static boolean tinTry(String tin) throws TINNotValidException {
        try {
            Integer.parseInt(tin);
        } catch (Exception e) {     // Проверка на цифры
            throw new TINNotValidException(tin);
        }
        if(tin.length()!= 12 && tin.length()!= 10) {    // Проверка на количество цифр
            throw new TINNotValidException(tin);
        }
        return true;    // ИНН действителен
    }
}
