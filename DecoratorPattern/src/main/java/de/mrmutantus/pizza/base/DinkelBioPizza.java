package de.mrmutantus.pizza.base;

public class DinkelBioPizza extends Pizza {
  public DinkelBioPizza() {
    this.description = "Dinkel Bio Pizza";
  }

  @Override
  public double price() {
    return 2.3;
  }

  @Override
  public double weight() {
    return 0.5;
  }

  @Override
  public int nutrition() {
    return 100;
  }
}
