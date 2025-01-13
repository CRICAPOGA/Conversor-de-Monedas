package principal;

import java.util.Scanner;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://latest.currency-api.pages.dev/v1/currencies/usd.json")) // URL de ejemplo
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // executeMenu();
        } catch (Exception e) {
            System.out.println("There was an error: " + e.getMessage());
        }
    }

    private static void executeMenu() {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            showMenu();
            option = readOption(sc);

            switch (option) {
                case 1:
                    convertDollarToEuro();
                    break;
                case 2:
                    convertDollarToBitcoin();
                    break;
                case 3:
                    convertDollarToYen();
                    break;
                case 4:
                    sayGoodbye();
                    break;
                default:
                    showInvalidOption();
            }

        } while (option != 4);

        sc.close();
    }

    private static void showMenu() {
        System.out.println("\n\n==================================");
        System.out.println("          CURRENCY CONVERTER");
        System.out.println("==================================");
        System.out.println("1. Convert Dollar to Euro");
        System.out.println("2. Convert Dollar to Bitcoin");
        System.out.println("3. Convert Dollar to Yen");
        System.out.println("4. Exit");
        System.out.println("==================================");
        System.out.print("Select an option: ");
    }

    private static int readOption(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            sc.next(); // Discard invalid input
        }
        return sc.nextInt();
    }

    private static void convertDollarToEuro() {
        System.out.println("You selected: Convert Dollar to Euro");
        // Implement conversion logic here
    }

    private static void convertDollarToBitcoin() {
        System.out.println("You selected: Convert Dollar to Bitcoin");
        // Implement conversion logic here
    }

    private static void convertDollarToYen() {
        System.out.println("You selected: Convert Dollar to Yen");
        // Implement conversion logic here
    }

    private static void sayGoodbye() {
        System.out.println("Thank you for using the converter. Goodbye!");
    }

    private static void showInvalidOption() {
        System.out.println("Invalid option. Please try again.");
    }
}
