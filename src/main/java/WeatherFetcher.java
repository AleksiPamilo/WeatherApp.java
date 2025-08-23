import java.net.http.*;
import java.net.URI;
import java.io.IOException;
import io.github.cdimascio.dotenv.Dotenv;

public class WeatherFetcher {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String API_KEY = dotenv.get("OPENWEATHER_API_KEY");

    public static String haeSaa(String kaupunki) {
        if (API_KEY == null || API_KEY.isEmpty()) {
            System.out.println("Aseta OPENWEATHER_API_KEY ympäristömuuttuja");
            return null;
        }

        String url = String.format(
                "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric&lang=fi",
                kaupunki, API_KEY
        );

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return response.body();
            } else {
                System.out.println(response.body());
                System.out.println("Virhe: " + response.statusCode());
                return null;
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
