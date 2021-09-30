package work_5;

public class Exercise10 {
    public static int recursion(int n, int x) {
        if (n == 0)
            return x;
        return recursion(n / 10, + (n % 10) + x * 10);
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(recursion(n, 0));
    }
}