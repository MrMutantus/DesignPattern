package de.mrmutantus.pizza.toppings;

import de.mrmutantus.pizza.base.Pizza;

public class Gouda extends Topping {
  private final Pizza pizza;

  public Gouda(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public double price() {
    return this.pizza.price() + 0.25;
  }

  @Override
  public double weight() {
    return this.pizza.weight() + 0.2;
  }

  @Override
  public int nutrition() {
    return this.pizza.nutrition() + 75;
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription() + " and gouda";
  }
}
