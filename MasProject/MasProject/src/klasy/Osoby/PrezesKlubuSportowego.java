package klasy.Osoby;

import klasy.KlubSportowy;
import klasy.Osoby.Klient;

public class PrezesKlubuSportowego extends Klient {
    int dlugoscKadencji;
    int iloscPomocnikow;
    int iloscOsiagniec;
    KlubSportowy klub;

    public PrezesKlubuSportowego(String imie, String nazwisko, String pesel,
                                 String numerTel, int wiek, String numberDowodu,
                                 String rodzaj, int dlugoscKadencji, int iloscPomocnikow,
                                 int iloscOsiagniec) {
        super(imie, nazwisko, pesel, numerTel, wiek, numberDowodu, rodzaj);
        this.dlugoscKadencji = dlugoscKadencji;
        this.iloscPomocnikow = iloscPomocnikow;
        this.iloscOsiagniec = iloscOsiagniec;
    }
    public PrezesKlubuSportowego(PrezesKlubuSportowego prezes) {
        super(prezes.imie, prezes.nazwisko, prezes.pesel, prezes.numerTel, prezes.wiek, prezes.numberDowodu, prezes.rodzaj);
        super.numer = prezes.numer;
        this.dlugoscKadencji = prezes.dlugoscKadencji;
        this.iloscPomocnikow = prezes.iloscPomocnikow;
        this.iloscOsiagniec = prezes.iloscOsiagniec;
        this.klub = prezes.klub;
    }

    public void setKlub(KlubSportowy klub) {
        if(this.klub != klub){
            this.klub = klub;
            this.klub.setPrezes(this);
        }
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " id: " + numer;
    }
}
