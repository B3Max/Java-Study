package work_5;

import java.util.Scanner;

public class Exercise17 {
    public static int recursion() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 0)
            return 0;
        return Math.max(num, recursion());
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}