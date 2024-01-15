package klasy.Rezerwacje;

import klasy.Osoby.Instruktor;
import klasy.Osoby.Klient;
import klasy.Osoby.PrezesKlubuSportowego;
import klasy.Osoby.Prywatny;
import klasy.Sprzet.SprzetPlywacki;
import klasy.Tory.Tor;

public class Rodzinna extends Rezerwacja {
    int iloscDzieciNiepelnoletnich;
    boolean rodzicUmiePlywac;
    double znizka;
    int iloscOsob;


    public Rodzinna(String dataRezerwacji, Prywatny prywatny, Instruktor instruktor, String rodzaj, Tor tor,int iloscDzieciNiepelnoletnich
                    , boolean rodzicUmiePlywac, double znizka, int iloscOsob) {
        super(dataRezerwacji, prywatny, instruktor, rodzaj, tor);
        this.iloscDzieciNiepelnoletnich = iloscDzieciNiepelnoletnich;
        this.rodzicUmiePlywac = rodzicUmiePlywac;
        this.znizka = znizka;
        this.iloscOsob = iloscOsob;
    }

    public Rodzinna(String dataRezerwacji, PrezesKlubuSportowego prezesKlubuSportowego, Instruktor instruktor, String rodzaj, Tor tor,int iloscDzieciNiepelnoletnich
                    , boolean rodzicUmiePlywac, double znizka, int iloscOsob) {
        super(dataRezerwacji, prezesKlubuSportowego, instruktor, rodzaj, tor);
        this.iloscDzieciNiepelnoletnich = iloscDzieciNiepelnoletnich;
        this.rodzicUmiePlywac = rodzicUmiePlywac;
        this.znizka = znizka;
        this.iloscOsob = iloscOsob;
    }
    public Rodzinna(Rodzinna rodzinna) {
        super(rodzinna.dataRezerwacji, rodzinna.prywatny, rodzinna.instruktor, rodzinna.rodzaj, rodzinna.tor);
        super.numer = rodzinna.numer;
        super.prezesKlubuSportowego = rodzinna.prezesKlubuSportowego;
        super.iloscSprzetu = rodzinna.iloscSprzetu;
        super.anulowana = rodzinna.anulowana;
        this.iloscDzieciNiepelnoletnich = rodzinna.iloscDzieciNiepelnoletnich;
        this.rodzicUmiePlywac = rodzinna.rodzicUmiePlywac;
        this.znizka = rodzinna.znizka;
        this.iloscOsob = rodzinna.iloscOsob;
    }
    @Override
    public String toString() {
        if(anulowana){
            return "Anulowana";
        }else{
            return "Rodzinna: " + dataRezerwacji + " ilosc osob: " + iloscOsob;

        }
    }
}
