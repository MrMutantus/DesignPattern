package de.mrmutantus.pizza.toppings;

import de.mrmutantus.pizza.base.Pizza;

public class Tomatosauce extends Topping {
  private final Pizza pizza;

  public Tomatosauce(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public double price() {
    return this.pizza.price();
  }

  @Override
  public double weight() {
    return this.pizza.weight() + 0.1;
  }

  @Override
  public int nutrition() {
    return this.pizza.nutrition() + 15;
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription() + " and Tomatosauce";
  }
}
