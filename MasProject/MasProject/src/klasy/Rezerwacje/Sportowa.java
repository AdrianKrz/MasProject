package klasy.Rezerwacje;

import klasy.Osoby.Instruktor;
import klasy.Osoby.Klient;
import klasy.Osoby.PrezesKlubuSportowego;
import klasy.Osoby.Prywatny;
import klasy.Sprzet.SprzetPlywacki;
import klasy.Tory.Tor;

public class Sportowa extends Rezerwacja {
    int iloscOsob;
    boolean dostepDoSlupkow;
    boolean miejsceNaSprzet;

    public Sportowa(String dataRezerwacji, PrezesKlubuSportowego prezesKlubuSportowego, Instruktor instruktor, String rodzaj, Tor tor,int iloscOsob,boolean dostepDoSlupkow,boolean miejsceNaSprzet) {
        super(dataRezerwacji, prezesKlubuSportowego, instruktor, rodzaj, tor);
        this.iloscOsob = iloscOsob;
        this.dostepDoSlupkow = dostepDoSlupkow;
        this.miejsceNaSprzet = miejsceNaSprzet;
    }
    public Sportowa(Sportowa sportowa) {
        super(sportowa.dataRezerwacji, sportowa.prezesKlubuSportowego, sportowa.instruktor, sportowa.rodzaj, sportowa.tor);
        super.numer = sportowa.numer;
        super.iloscSprzetu = sportowa.iloscSprzetu;
        super.anulowana = sportowa.anulowana;
        this.iloscOsob = sportowa.iloscOsob;
        this.dostepDoSlupkow = sportowa.dostepDoSlupkow;
        this.miejsceNaSprzet = sportowa.miejsceNaSprzet;
    }

    @Override
    public String toString() {
        if(anulowana){
            return "Anulowana";
        }else {
            return "Sportowa: " + dataRezerwacji + " ilosc osob: " + iloscOsob;

        }
    }
}
