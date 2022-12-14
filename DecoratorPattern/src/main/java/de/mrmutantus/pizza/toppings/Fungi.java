package de.mrmutantus.pizza.toppings;

import de.mrmutantus.pizza.base.Pizza;

public class Fungi extends Topping {
  private final Pizza pizza;

  public Fungi(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public double price() {
    return this.pizza.price() + 0.1;
  }

  @Override
  public double weight() {
    return this.pizza.weight() + 0.15;
  }

  @Override
  public int nutrition() {
    return this.pizza.nutrition() + 20;
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription() + " and fungi";
  }
}
