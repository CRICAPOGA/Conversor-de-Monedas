package principal;

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
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Estado: " + response.statusCode());
            System.out.println("Cuerpo: " + response.body());

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Hubo un Error: " + e.getMessage());
        }
    }
    
}