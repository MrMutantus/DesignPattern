package de.mrmutantus.strategie;

public class PaypalStrategie implements Bezahlstrategie {
  private final String email;
  private final String passwort;

  public PaypalStrategie(String email, String passwort) {
    this.email = email;
    this.passwort = passwort;
  }

  @Override
  public void zahle(double betrag) {
    String ausgabe = String.format("%,.2f Euro mit Paypal bezahlt.", betrag);
    System.out.println(ausgabe);
  }
}
