package bev1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int colaPrice = 80;
        int waterPrice = 55;

        int choice;

        do {
            System.out.println("Beverage Options:");
            System.out.println("1. Cola (80 Lek)");
            System.out.println("2. Water (55 Lek)");

            System.out.print("Select a beverage (1 for Cola, 2 for Water): ");
            choice = scanner.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 1 && choice != 2);

        int selectedBeveragePrice = (choice == 1) ? colaPrice : waterPrice;
        int amountDue = selectedBeveragePrice;

        System.out.println("Amount due: " + amountDue + " Lek");

        while (amountDue > 0) {
            System.out.print("Insert coin (5, 10, 20, 50, 100 Lek): ");
            int coin = scanner.nextInt();

            // Validate coin denomination
            if (coin != 5 && coin != 10 && coin != 20 && coin != 50 && coin != 100) {
                System.out.println("Invalid coin denomination. Try again.");
                continue;
            }

            amountDue -= coin;

            if (amountDue > 0) {
                System.out.println("Amount due: " + amountDue + " Lek");
            } else if (amountDue < 0) {
                System.out.println("Change owed: " + (-amountDue) + " Lek");
            } else {
                System.out.println("Payment successful. Enjoy your beverage!");
            }
        }

        scanner.close();
    }
}

