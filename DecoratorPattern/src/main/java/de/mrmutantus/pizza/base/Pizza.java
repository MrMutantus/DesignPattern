package de.mrmutantus.pizza.base;

import lombok.Getter;

@Getter
public abstract class Pizza {
  public String description = "Pizza";

  public abstract double price();

  public abstract double weight();

  public abstract int nutrition();

  @Override
  public String toString() {
    return this.getDescription() + "\n" + "Price: " + price() + " €\nWeight: " + weight() + " kg\nNutrition: " + nutrition() + " kcal";
  }

  public void display() {
    System.out.println(this.getDescription());
  }
}
