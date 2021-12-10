package work_25.ex8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);

        boolean anchor = false;
        do {
            anchor = false;
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                anchor = true;
            }
        } while (anchor);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo td = new ThrowsDemo();
        try {
            td.getKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
