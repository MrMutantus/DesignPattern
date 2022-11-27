package de.mrmutantus.strategie;

public class BarStrategie implements Bezahlstrategie {
  public BarStrategie() {
  }

  @Override
  public void zahle(double betrag) {
    String ausgabe = String.format("%,.2f Euro bar bezahlt.", betrag);
    System.out.println(ausgabe);
  }
}
