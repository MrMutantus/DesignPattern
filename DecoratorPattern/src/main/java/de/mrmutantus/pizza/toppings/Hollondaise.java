package de.mrmutantus.pizza.toppings;

import de.mrmutantus.pizza.base.Pizza;

public class Hollondaise extends Topping {
  private final Pizza pizza;

  public Hollondaise(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public double price() {
    return pizza.price() + 0.5;
  }

  @Override
  public double weight() {
    return pizza.weight() + 0.1;
  }

  @Override
  public int nutrition() {
    return pizza.nutrition() + 30;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + " and Sauce Hollondaise";
  }
}
