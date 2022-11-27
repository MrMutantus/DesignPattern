package de.mrmutantus.markt;

import lombok.Getter;

@Getter
public class Artikel {
  private final String name;
  private final double preis;

  public Artikel(String name, double preis) {
    this.name = name;
    this.preis = preis;
  }

  public void display() {
    String artikel = String.format("#%-20.20s %,.2f€", name, preis);
    System.out.println(artikel);
  }
}
