package principal;

import java.util.Scanner;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://latest.currency-api.pages.dev/v1/currencies/usd.json"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();
            ExchangeRates rates = gson.fromJson(json, ExchangeRates.class);


            executeMenu(rates);
        } catch (Exception e) {
            System.out.println("There was an error: " + e.getMessage());
        }
    }

    private static void executeMenu(ExchangeRates rates) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            showMenu();
            option = readOption(sc);
            System.out.println("==================================");

            switch (option) {
                case 1:
                    convertDollarToEuro(rates);
                    break;
                case 2:
                    convertDollarToBitcoin(rates);
                    break;
                case 3:
                    convertDollarToYen(rates);
                    break;
                case 4:
                    System.out.println("Thank you for using the converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
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

    private static void convertDollarToEuro(ExchangeRates rates) {
        double usd;
        double eur = rates.usd.get("eur");
        Scanner sc = new Scanner(System.in);

        System.out.println("You selected: Convert Dollar to Euro");
        System.out.println("Specify the amount you desire to exchange for euros");
        usd = sc.nextDouble();
        System.out.println(usd + " USD = " + (eur*usd) + " EUR");
    }

    private static void convertDollarToBitcoin(ExchangeRates rates) {
        System.out.println("You selected: Convert Dollar to Bitcoin");
        double usd;
        double btc = rates.usd.get("btc");
        Scanner sc = new Scanner(System.in);

        System.out.println("Specify the amount you desire to exchange for Bitcoins");
        usd = sc.nextDouble();
        System.out.println(usd + " USD = " + (btc * usd) + " BTC");
    }

    private static void convertDollarToYen(ExchangeRates rates) {
        System.out.println("You selected: Convert Dollar to Yen");
        double usd;
        double jpy = rates.usd.get("jpy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Specify the amount you desire to exchange for yens");
        usd = sc.nextDouble();
        System.out.println(usd + " USD = " + (jpy * usd) + " JPY");
    }

}