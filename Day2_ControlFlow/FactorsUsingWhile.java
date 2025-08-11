package Day2_ControlFlow;

import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number > 0) {
            int i = 1;
            System.out.println("Factors of " + number + " are:");
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}
