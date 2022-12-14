package de.mrmutantus.pizza.base;

public class GlutenfreePizza extends Pizza {
  public GlutenfreePizza() {
    this.description = "Glutenfree Pizza";
  }

  @Override
  public double price() {
    return 2.1;
  }

  @Override
  public double weight() {
    return 0.5;
  }

  @Override
  public int nutrition() {
    return 50;
  }
}
