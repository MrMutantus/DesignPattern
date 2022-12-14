package de.mrmutantus.pizza.base;

public class ClassicPizza extends Pizza {
  public ClassicPizza() {
    this.description = "Classico Pizza";
  }

  @Override
  public double price() {
    return 1.5;
  }

  @Override
  public double weight() {
    return 0.5;
  }

  @Override
  public int nutrition() {
    return 80;
  }
}
