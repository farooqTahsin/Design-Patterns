package weather_station;

/*
    The Observer Pattern defines a one-to-many dependency between objects so that when one
    object changes state, all of its dependents are notified and updated automatically.
*/

import weather_station.observable.WeatherData;
import weather_station.observer.CurrentConditionsDisplay;
import weather_station.observer.ForecastDisplay;
import weather_station.observer.StatisticsDisplay;

public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();

        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();

        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();

        weatherData.removeObserver(forecastDisplay);

        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
