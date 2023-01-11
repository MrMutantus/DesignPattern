package de.mrmutantus;

import de.mrmutantus.pizza.*;

public class BerlinPizzeria extends Pizzeria {
  @Override
  protected Pizza createPizza(String typ) {
    if (typ.equalsIgnoreCase("Salami")) {
      return new BerlinSalamiPizza();
    } else if (typ.equalsIgnoreCase("Schinken")) {
      return new BerlinHamPizza();
    } else if (typ.equalsIgnoreCase("Krabben")) {
      return new BerlinCrabPizza();
    } else if (typ.equalsIgnoreCase("Thunfisch")) {
      return new BerlinTunaPizza();
    } else {
      return null;
    }
  }
}
