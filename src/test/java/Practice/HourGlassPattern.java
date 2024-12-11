package Practice;

import java.util.Scanner;

public class HourGlassPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the hourglass
        System.out.print("Enter the size of the hourglass (odd number): ");
        int n = scanner.nextInt();

        // Validate input for odd number
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        // Top part of the hourglass
        for (int i = 0; i < n / 2 + 1; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom part of the hourglass
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
