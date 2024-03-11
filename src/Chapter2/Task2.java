package Chapter2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        double area = calculateArea(radius);
        double volume = calculateVolume(area, length);

        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);

        scanner.close();
    }

    private static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static double calculateVolume(double area, double length) {
        return area * length;
    }
}
