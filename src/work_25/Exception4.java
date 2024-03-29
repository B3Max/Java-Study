package work_25;

import java.util.Scanner;

/*
И наконец добавьте блок finally к решению Задания №2.
Повторно запустите программу, чтобы проверить ее поведение. Объясните новое поведение программы
 */
public class Exception4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch(Exception e) {
            System.out.println("Exception happened!");
        }
        finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        Exception4 e2 = new Exception4();
        e2.exceptionDemo();
    }
}
