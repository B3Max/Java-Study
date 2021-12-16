//package work_13_14;
//
//import java.util.Scanner;
//
//class Calendar {
//    private final String time;
//    private String hours;
//    private String minutes;
//
//    public Calendar(String time) {
//        this.time = time;
//        time_handler();
//    }
//
//    public void time_handler() {
//        String[] tmp = time.split(" ");
//        char[] chars = tmp[0].toCharArray();
//        hours = chars[0] + String.valueOf(chars[1]);
//        chars = tmp[1].toCharArray();
//        minutes = String.valueOf(chars[0]) + chars[1];
//    }
//
//    @Override
//    public String toString() {
//        return "Time {" +
//                "hours=" + hours +
//                ", minutes=" + minutes +
//                '}';
//    }
//}
//
//class Date {
//    private final String date;
//    private String day, month, year;
//
//    public Date(String date) {
//        this.date = date;
//        date_handler();
//    }
//
//    @Override
//    public String toString() {
//        return "Date {" +
//                "day=" + day +
//                ", month=" + month +
//                ", year=" + year +
//                '}';
//    }
//
//    public void date_handler() {
//        String[] tmp = date.split(" ");
//        char[] chars = tmp[0].toCharArray();
//        day = String.valueOf(chars[0]) + chars[1];
//        chars = tmp[1].toCharArray();
//        month = String.valueOf(chars[0]) + chars[1];
//        chars = tmp[2].toCharArray();
//        year = String.valueOf(chars[0]) + chars[1] + chars[2] + chars[3];
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите дату: день, месяц, год");
//        Date date = new Date(scanner.nextLine());
//        System.out.println("Введите время: часы, минуты");
//        Calendar calendar = new Calendar(scanner.nextLine());
//        System.out.println(calendar);
//        System.out.println(date);
//    }
//}