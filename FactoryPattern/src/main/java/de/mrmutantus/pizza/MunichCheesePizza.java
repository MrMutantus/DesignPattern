package de.mrmutantus.pizza;

public class MunichCheesePizza extends Pizza {
  public MunichCheesePizza() {
    name = "Deftige Käsepizza im Münchener Stil";
    dough = "Teig mit extra dicker Kruste";
    sauce = "Tomatensoße";

    toppings.add("Mozzarella");
  }

  @Override
  public void cut() {
    System.out.println("Schneide die Pizza in rechteckige Stücke");
  }
}
