package Chapter2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        scanner.close();

        System.out.print("Enter temperature in Celsius: ");

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }
}
