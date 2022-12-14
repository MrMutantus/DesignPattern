package de.mrmutantus;

import de.mrmutantus.pizza.base.ClassicPizza;
import de.mrmutantus.pizza.base.Pizza;
import de.mrmutantus.pizza.toppings.Fungi;
import de.mrmutantus.pizza.toppings.Parmesan;
import de.mrmutantus.pizza.toppings.Salami;
import de.mrmutantus.pizza.toppings.Tomatosauce;

public class PizzaOrder {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Hello. What can i do for you?");
    Thread.sleep(100);
    System.out.println("I want a classic pizza with the following toppings:");
    Pizza pizza = new ClassicPizza();
    System.out.println("# tomato sauce");
    pizza = new Tomatosauce(pizza);
    System.out.println("# parmesan cheese");
    pizza = new Parmesan(pizza);
    System.out.println("# salami");
    pizza = new Salami(pizza);
    System.out.println("# fungi");
    pizza = new Fungi(pizza);
    Thread.sleep(100);
    System.out.println("Thank you for your order. Please wait. We will call you when we are ready.");
    System.out.println("##################################");
    System.out.println(pizza);
  }
}