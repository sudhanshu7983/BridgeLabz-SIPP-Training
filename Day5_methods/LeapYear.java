package Day5_Methods;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (isLeapYear(year)) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
        sc.close();
    }
}
