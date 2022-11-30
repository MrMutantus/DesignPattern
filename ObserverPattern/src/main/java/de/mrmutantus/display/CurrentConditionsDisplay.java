package de.mrmutantus.display;

import de.mrmutantus.data.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(Observable observable) {
    observable.addObserver(this);
  }

  @Override
  public void update(Observable observable, Object arg) {
    if (observable instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) observable;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "°C degrees and " + humidity + "% humidity");
  }
}

