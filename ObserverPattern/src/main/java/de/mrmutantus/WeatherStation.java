package de.mrmutantus;

import de.mrmutantus.data.WeatherData;
import de.mrmutantus.display.CurrentConditionsDisplay;
import de.mrmutantus.display.ForecastDisplay;
import de.mrmutantus.display.StatisticsDisplay;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    System.out.println("####################");
    weatherData.setMeasurements(30, 65, 30.4f);
    System.out.println("####################");
    weatherData.setMeasurements(32, 70, 29.2f);
    System.out.println("####################");
    weatherData.setMeasurements(28, 90, 29.2f);
    System.out.println("####################");
  }
}