package Chapter2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();

        scanner.close();

        int sum = 0;
        int remainingNumber = number;

        while (remainingNumber > 0) {
            int digit = remainingNumber % 10;
            sum += digit;
            remainingNumber /= 10;
        }

        System.out.println("The sum of the digits is " + sum);

    }
}
