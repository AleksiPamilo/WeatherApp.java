# CLI Weather App
A simple Java console application that fetches current weather data from the OpenWeatherMap API (https://openweathermap.org/api).

## Requirements
- Java 17 or newer
- IntelliJ Idea (or other IDE)

## Setup
1. Clone this repository
2. Create a .env file in the project root:
OPENWEATHER_API_KEY=your_openweathermap_api_key

## Build & Run
1. Open the project in IntelliJ IDEA
2. Right-click Main.java → Run
3. Enter a city name when prompted

## Example output
```
Sää kaupungissa Helsinki:
Lämpötila: 16,3 °C
Kosteus: 57%
Kuvaus: vähän pilviä
```

## Notes
The API key is loaded from the .env file using dotenv-java (https://github.com/cdimascio/dotenv-java). 

By default:
- temperature is shown in Celsius
- language is Finnish
