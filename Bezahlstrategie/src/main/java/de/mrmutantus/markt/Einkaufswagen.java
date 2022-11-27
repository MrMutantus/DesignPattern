package de.mrmutantus.markt;

import de.mrmutantus.strategie.Bezahlstrategie;

import java.util.ArrayList;
import java.util.List;

public class Einkaufswagen {
  private final List<Artikel> artikelliste;

  public Einkaufswagen() {
    artikelliste = new ArrayList<>();
  }

  public void einkaufen(Artikel a) {
    artikelliste.add(a);
  }

  public void weglegen(Artikel a) {
    artikelliste.remove(a);
  }

  public double berechneGesamtsumme() {
    return this.artikelliste.stream()
                            .map(Artikel::getPreis)
                            .reduce(0.0, Double::sum);
  }

  public void bezahle(Bezahlstrategie b) {
    b.zahle(this.berechneGesamtsumme());
  }

  public void getArtikel() {
    System.out.println("Artikel im Einkaufswagen:");
    this.artikelliste.forEach(Artikel::display);
  }
}
