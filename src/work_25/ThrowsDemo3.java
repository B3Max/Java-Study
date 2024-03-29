package work_25;

import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails(key);
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

    public static void main(String[] args) throws Exception {
        ThrowsDemo3 td = new ThrowsDemo3();
//        try {
            td.getKey();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}