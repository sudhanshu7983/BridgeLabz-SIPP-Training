package Day2_ControlFlow;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        } else {
            System.out.println("Enter a non-negative number.");
        }

        sc.close();
    }
}
