package de.mrmutantus.pizza;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
  @Getter
  String name;
  String dough;
  String sauce;
  List<String> toppings = new ArrayList<>();

  public void prepare() {
    System.out.println("Bereite " + name + " zu...");
    System.out.println("Werfe " + dough + " ...");
    System.out.println("Füge " + sauce + " hinzu ...");
    System.out.println("Füge Beläge hinzu: ");
    toppings.forEach(topping -> System.out.println(" - " + topping));
  }

  public void bake() {
    System.out.println("Backe 25 Minuten bei 350 Grad");
  }

  public void cut() {
    System.out.println("Schneide die Pizza diagonal in Stücke");
  }

  public void wrap() {
    System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
  }
}
