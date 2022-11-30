package de.mrmutantus.display;

import de.mrmutantus.data.WeatherData;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
  Map<Integer, String> forecastMap;
  private int counter;
  private String forecast = "There is no forecast";

  public ForecastDisplay(Observable observable) {
    counter = 0;
    initForecast();
    observable.addObserver(this);
  }

  private void initForecast() {
    forecastMap = new HashMap<>();
    forecastMap.put(0, "Improving weather on the way!");
    forecastMap.put(1, "Watch out for cooler, rainy weather");
    forecastMap.put(2, "More of the same");
  }

  @Override
  public void update(Observable observable, Object arg) {
    if (observable instanceof WeatherData) {
      calcualteForecast();
      counter = (counter + 1) % 3;
      display();
    }
  }

  private void calcualteForecast() {
    forecast = forecastMap.get(counter);
  }

  @Override
  public void display() {
    System.out.println("Forecast: " + forecast);
  }
}
