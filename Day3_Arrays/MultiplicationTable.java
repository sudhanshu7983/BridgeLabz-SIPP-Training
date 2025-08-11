package Day3_Arrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        sc.close();
    }
}
