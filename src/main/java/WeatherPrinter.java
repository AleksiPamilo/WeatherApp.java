import org.json.JSONObject;

public class WeatherPrinter {
    public static void tulostaSaa(String jsonData) {
        if (jsonData == null) return;

        JSONObject json = new JSONObject(jsonData);

        String kaupunki = json.getString("name");
        double lampotila = json.getJSONObject("main").getDouble("temp");
        int kosteus = json.getJSONObject("main").getInt("humidity");
        String kuvaus = json.getJSONArray("weather").getJSONObject(0).getString("description");

        System.out.printf("Sää kaupungissa %s:%n", kaupunki);
        System.out.printf("Lämpötila: %.1f °C%n", lampotila);
        System.out.printf("Kosteus: %d%%%n", kosteus);
        System.out.printf("Kuvaus: %s%n", kuvaus);
    }
}
