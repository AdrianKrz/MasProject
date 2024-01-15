package klasy.Sprzet;

import klasy.Sprzet.SprzetPlywacki;

public class OkularyPlywacki extends SprzetPlywacki {
    String rodzajSzkiel;
    String kolorGumki;
    String rozmiarNoska;

    public OkularyPlywacki(boolean czyWolny, int ilosc, String rodzajSzkiel, String kolorGumki, String rozmiarNoska) {
        super(czyWolny, ilosc);
        this.rodzajSzkiel = rodzajSzkiel;
        this.kolorGumki = kolorGumki;
        this.rozmiarNoska = rozmiarNoska;
    }
    public OkularyPlywacki(OkularyPlywacki okularyPlywacki) {
        super(okularyPlywacki.czyWolny, okularyPlywacki.ilosc);
        super.numer = okularyPlywacki.numer;
        super.iloscDoWykorzystania = okularyPlywacki.iloscDoWykorzystania;
        super.tory = okularyPlywacki.tory;
        this.rodzajSzkiel = okularyPlywacki.rodzajSzkiel;
        this.kolorGumki = okularyPlywacki.kolorGumki;
        this.rozmiarNoska = okularyPlywacki.rozmiarNoska;
    }

    @Override
    public String toString() {
        return "Okulary plywackie, dostepna ilosc: " + iloscDoWykorzystania;
    }
}
