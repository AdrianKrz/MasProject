package klasy.Rezerwacje;

import klasy.Osoby.Instruktor;
import klasy.Osoby.Klient;
import klasy.Osoby.PrezesKlubuSportowego;
import klasy.Osoby.Prywatny;
import klasy.Sprzet.SprzetPlywacki;
import klasy.Tory.Tor;

public class Grupowa extends Rezerwacja {
    String poziomZaawansowania;
    int iloscOsob;


    public Grupowa(String dataRezerwacji, Prywatny prywatny, Instruktor instruktor, String rodzaj, Tor tor, String poziomZaawansowania, int iloscOsob) {
        super(dataRezerwacji, prywatny, instruktor, rodzaj, tor);
        this.poziomZaawansowania = poziomZaawansowania;
        this.iloscOsob = iloscOsob;
    }

    public Grupowa(String dataRezerwacji, PrezesKlubuSportowego prezesKlubuSportowego, Instruktor instruktor, String rodzaj, Tor tor, String poziomZaawansowania, int iloscOsob) {
        super(dataRezerwacji, prezesKlubuSportowego, instruktor, rodzaj, tor);
        this.poziomZaawansowania = poziomZaawansowania;
        this.iloscOsob = iloscOsob;
    }

    public Grupowa(Grupowa grupowa) {
        super(grupowa.dataRezerwacji, grupowa.prywatny, grupowa.instruktor, grupowa.rodzaj, grupowa.tor);
        super.prezesKlubuSportowego = grupowa.prezesKlubuSportowego;
        super.numer = grupowa.numer;
        super.anulowana = grupowa.anulowana;
        super.iloscSprzetu = grupowa.iloscSprzetu;
        this.poziomZaawansowania = grupowa.poziomZaawansowania;
        this.iloscOsob = grupowa.iloscOsob;
    }

    @Override
    public String toString() {
        if(anulowana){
            return "Anulowana";
        }else{
            return "Grupowa: " + dataRezerwacji + " ilosc osob: " + iloscOsob;
        }
    }
}
