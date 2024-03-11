package Chapter2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = scanner.nextDouble();

        System.out.print("Enter the gratuity rate in percentage: ");
        double gratuityRate = scanner.nextDouble();

        scanner.close();

        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.printf("The gratuity is " + gratuity + " and the total is $" + total);
    }
}
