package de.mrmutantus;

import de.mrmutantus.pizza.Pizza;

public abstract class Pizzeria {
  Pizza orderPizza(String typ) {
    Pizza pizza = createPizza(typ);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.wrap();

    return pizza;
  }

  protected abstract Pizza createPizza(String typ);
}
