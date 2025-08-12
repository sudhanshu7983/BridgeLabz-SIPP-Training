package Day3_Arrays;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (num > 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        sc.close();
    }
}
