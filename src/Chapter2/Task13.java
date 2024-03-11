package Chapter2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = scanner.nextDouble();

        scanner.close();

        final double annualInterestRate = 0.05;
        final int numberOfMonths = 6;

        double monthlyInterestRate = annualInterestRate / 12;

        double accountValue = 0;
        for (int i = 0; i < numberOfMonths; i++) {
            accountValue = (accountValue + monthlySavingAmount) * (1 + monthlyInterestRate);
        }

        System.out.printf("After the sixth month, the account value is " + accountValue);

    }
}
