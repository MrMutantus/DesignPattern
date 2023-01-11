package de.mrmutantus;

import de.mrmutantus.pizza.Pizza;

public class PizzaTestlauf {
  public static void main(String[] args) {
    Pizzeria berlinPizzeria = new BerlinPizzeria();
    Pizzeria muenchenPizzeria = new MunichPizzeria();

    Pizza pizza = berlinPizzeria.orderPizza("Salami");
    System.out.println("Ben hat eine " + pizza.getName() + " bestellt\n");

    pizza = muenchenPizzeria.orderPizza("Käse");
    System.out.println("Tassilo hat eine " + pizza.getName() + " bestellt\n");
  }
}
