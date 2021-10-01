package work_5;

import java.util.Scanner;

public class Exercise16 {
    public static void recursion(int max, int count) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0) {
            if (num > max) {
                recursion(num, 1);
            }
            else if (num == max) {
                recursion(max, ++count);
            }
            else {
                recursion(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        recursion(0, 0); // вызов рекурсивной функции
    }
}