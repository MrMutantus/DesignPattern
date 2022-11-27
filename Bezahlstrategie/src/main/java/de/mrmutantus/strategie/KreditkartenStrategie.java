package de.mrmutantus.strategie;

public class KreditkartenStrategie implements Bezahlstrategie {
  private final String name;
  private final String kartenNummer;
  private final String cw;
  private final String ablaufdatum;

  public KreditkartenStrategie(String name, String kartenNummer, String cw, String ablaufdatum) {
    this.name = name;
    this.kartenNummer = kartenNummer;
    this.cw = cw;
    this.ablaufdatum = ablaufdatum;
  }

  @Override
  public void zahle(double betrag) {
    String ausgabe = String.format("%,.2f Euro mit Kreditkarte bezahlt.", betrag);
    System.out.println(ausgabe);
  }
}
