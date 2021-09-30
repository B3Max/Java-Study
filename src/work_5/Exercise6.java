package work_5;

public class Exercise6 {
    public static boolean recursion(int x, int del) {
        if (x % del == 0) {
            return false;
        }
        if (del >= Math.sqrt(x)) {
            return true;
        }
        return recursion(x, del + 1);
    }

    public static void main(String[] args) {
        int x = 53;
        boolean result = recursion(x, 2);
        if (result)
            System.out.println("YES");
        else System.out.println("NO");
    }
}