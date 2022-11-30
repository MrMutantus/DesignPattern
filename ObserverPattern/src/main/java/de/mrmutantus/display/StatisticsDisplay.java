package de.mrmutantus.display;

import de.mrmutantus.data.WeatherData;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
  ArrayList<Float> temperatures;
  private float maxTemperature;
  private float minTemperature;
  private float avgTemperature;

  public StatisticsDisplay(Observable observable) {
    temperatures = new ArrayList<>();
    observable.addObserver(this);
  }

  @Override
  public void update(Observable observable, Object arg) {
    if (observable instanceof WeatherData) {
      temperatures.add(((WeatherData) observable).getTemperature());
      calculateMaximumTemperature();
      calculateMinimumTemperature();
      calculateAverageTemperature();
      display();
    }
  }

  private void calculateMaximumTemperature() {
    if (temperatures.size() > 0) {
      maxTemperature = temperatures.get(0);
    }
    for (int i = 1; i < temperatures.size(); i++) {
      float temperature = temperatures.get(i);
      if (temperature > maxTemperature) {
        maxTemperature = temperature;
      }
    }
  }

  private void calculateMinimumTemperature() {
    if (temperatures.size() > 0) {
      minTemperature = temperatures.get(0);
    }
    for (int i = 1; i < temperatures.size(); i++) {
      float temperature = temperatures.get(i);
      if (temperature < minTemperature) {
        minTemperature = temperature;
      }
    }
  }

  private void calculateAverageTemperature() {
    float size = temperatures.size();
    float sumTemperatures = 0;
    for (Float temperature : temperatures) {
      sumTemperatures += temperature;
    }
    avgTemperature = sumTemperatures / size;
  }

  @Override
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
  }
}
