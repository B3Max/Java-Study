package work_13_14;

import java.util.Date;
import java.util.Scanner;

class _1 {
    private Date getDateOfTask;
    private Date getDateOfFinishTask;

    public String InputFio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Surname ");
        return scanner.nextLine();
    }

    public void getDateOfBeginTask() {
        Date getDateOfTask = new Date();
        long time = getDateOfTask.getTime();
        long anotherDate = -14;
        time = time + (60 * 60 * 24 * 1000 * anotherDate);
        getDateOfTask = new Date(time);
        System.out.println("Task received: " + getDateOfTask);
    }

    public void getDateOfFinishTask() {
        Date getDateOfFinishTask = new Date();
        System.out.println("Task completed: " + getDateOfFinishTask);
    }

    public static void main(String[] args) {
        _1 devInf = new _1();
        String surname = devInf.InputFio();
        System.out.println("Developers Surname is " + surname);
        devInf.getDateOfBeginTask();
        devInf.getDateOfFinishTask();
    }
}