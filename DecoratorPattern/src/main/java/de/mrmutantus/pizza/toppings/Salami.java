package de.mrmutantus.pizza.toppings;

import de.mrmutantus.pizza.base.Pizza;

public class Salami extends Topping {
  private final Pizza pizza;

  public Salami(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public double price() {
    return this.pizza.price() + 0.3;
  }

  @Override
  public double weight() {
    return this.pizza.weight() + 0.3;
  }

  @Override
  public int nutrition() {
    return this.pizza.nutrition() + 85;
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription() + " and salami";
  }
}
