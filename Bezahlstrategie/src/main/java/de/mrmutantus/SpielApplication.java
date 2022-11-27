package de.mrmutantus;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.mrmutantus.markt.Artikel;
import de.mrmutantus.markt.Einkaufswagen;
import de.mrmutantus.strategie.BarStrategie;
import de.mrmutantus.strategie.Bezahlstrategie;
import de.mrmutantus.strategie.KreditkartenStrategie;
import de.mrmutantus.strategie.PaypalStrategie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpielApplication {
  public static void main(String[] args) {
    List<Artikel> artikel = generateArtikelListe();

    Einkaufswagen einkaufswagen = new Einkaufswagen();

    fillEinkaufswagen(einkaufswagen, artikel, 10);

    List<Bezahlstrategie> bezahlStrategien = new ArrayList<>();
    bezahlStrategien.add(new BarStrategie());
    bezahlStrategien.add(new KreditkartenStrategie("Timo", "4871264921", "123", "10/25"));
    bezahlStrategien.add(new PaypalStrategie("timo@paypal.com", "12345"));

    showEinkaufswagenAndPayRandom(einkaufswagen, bezahlStrategien);
  }

  private static void showEinkaufswagenAndPayRandom(Einkaufswagen einkaufswagen, List<Bezahlstrategie> bezahlStrategien) {
    Random random = new Random();
    einkaufswagen.getArtikel();

    einkaufswagen.bezahle(bezahlStrategien.get(random.nextInt(bezahlStrategien.size())));
  }

  private static void fillEinkaufswagen(Einkaufswagen einkaufswagen, List<Artikel> artikel, int anzahl) {
    Random random = new Random();

    for (int i = 0; i < anzahl; i++) {
      einkaufswagen.einkaufen(artikel.get(random.nextInt(artikel.size())));
    }
  }

  private static List<Artikel> generateArtikelListe() {
    List<Artikel> artikel = new ArrayList<>();
    artikel.add(new Artikel("Northface Jacke", 199.99));
    artikel.add(new Artikel("Northface Hose", 149.99));
    artikel.add(new Artikel("Billojacke", 14.99));
    artikel.add(new Artikel("Billohose", 19.99));
    artikel.add(new Artikel("Poloshirt", 18.99));
    artikel.add(new Artikel("V-Neck Tshirt", 9.99));
    //ObjectMapper mapper = new ObjectMapper();
    //mapper.writeValueAsString(artikel);
    return artikel;
  }
}
