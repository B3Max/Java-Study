package work_5;

import java.util.Scanner;

public class Exercise16 {
    public static int recursion(int count) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 0)
            return 0;
        int max = recursion(count);
        if (num == max)
            return recursion(count++);
        return Math.max(num, max);
    }

    public static void main(String[] args) {
        System.out.println(recursion(0));
    }
}