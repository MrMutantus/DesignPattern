package de.mrmutantus;

import de.mrmutantus.markt.Artikel;
import de.mrmutantus.markt.Einkaufswagen;
import de.mrmutantus.strategie.Bezahlstrategie;
import de.mrmutantus.strategie.KreditkartenStrategie;
import de.mrmutantus.strategie.PaypalStrategie;

public class Startklasse {
  public static void main(String[] args) {
    Einkaufswagen einkaufswagen = new Einkaufswagen();

    Artikel jacke = new Artikel("Jacke", 59.99);
    Artikel hose = new Artikel("Hose", 49.99);

    einkaufswagen.einkaufen(jacke);
    einkaufswagen.einkaufen(hose);

    // bezahlen mit Kreditkarte
    Bezahlstrategie bezahlstrategie = new KreditkartenStrategie("Hans", "987654321", "123", "10/20");
    einkaufswagen.bezahle(bezahlstrategie);

    // bezahlen mit Paypal:
    bezahlstrategie = new PaypalStrategie("hans@wurst.de", "geheim");
    einkaufswagen.bezahle(bezahlstrategie);
  }
}