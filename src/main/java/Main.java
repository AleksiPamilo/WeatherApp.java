public class Main {
    public static void main(String[] args) {
        String kaupunki = InputHandler.kysyKaupunki();
        String json = WeatherFetcher.haeSaa(kaupunki);
        WeatherPrinter.tulostaSaa(json);
    }
}