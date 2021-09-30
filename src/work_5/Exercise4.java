package work_5;

public class Exercise4 {
    public static int recursion(int x) {
        if (x / 10 == 0) {
            return x;
        }
        return recursion(x/10) + x % 10;
    }

    public static void main(String[] args) {
        int s = 0;
        int k = 3, d = 1;
        for(int i = (int)Math.pow(10,k-1); i < Math.pow(10,k); i++) {
            if (recursion(i) == d) {
                s++;
                //System.out.println(i);
            }
        }
        System.out.println(s);
    }
}
