package de.mrmutantus;

import de.mrmutantus.pizza.*;

public class MunichPizzeria extends Pizzeria {
  @Override
  protected Pizza createPizza(String typ) {
    if (typ.equalsIgnoreCase("Käse")) {
      return new MunichCheesePizza();
    } else if (typ.equalsIgnoreCase("Schinken")) {
      return new MunichHamPizza();
    } else if (typ.equalsIgnoreCase("Krabben")) {
      return new MunichCrabPizza();
    } else if (typ.equalsIgnoreCase("Thunfisch")) {
      return new MunichTunaPizza();
    } else {
      return null;
    }
  }
}
