package testCalendar;

import java.util.Date;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date();
        String mon = Exercise.getMonday(date);
        System.out.println(mon);
    }
}
