package klasy.Rezerwacje;

import klasy.Osoby.Instruktor;
import klasy.Osoby.Klient;
import klasy.Osoby.PrezesKlubuSportowego;
import klasy.Osoby.Prywatny;
import klasy.Sprzet.SprzetPlywacki;
import klasy.Tory.Tor;

public class Pojedyncza extends Rezerwacja {
    boolean czyPelnoletni;
    String numerOpiekuna;


    public Pojedyncza(String dataRezerwacji, Prywatny prywatny, Instruktor instruktor, String rodzaj, Tor tor, boolean czyPelnoletni,String numerOpiekuna) {
        super(dataRezerwacji, prywatny, instruktor, rodzaj, tor);
        this.czyPelnoletni = czyPelnoletni;
        this.numerOpiekuna = numerOpiekuna;
    }
    public Pojedyncza(String dataRezerwacji, Prywatny prywatny, Instruktor instruktor, String rodzaj, Tor tor, boolean czyPelnoletni) {
        super(dataRezerwacji, prywatny, instruktor, rodzaj, tor);
        this.czyPelnoletni = czyPelnoletni;
    }
    public Pojedyncza(Pojedyncza pojedyncza) {
        super(pojedyncza.dataRezerwacji, pojedyncza.prywatny, pojedyncza.instruktor, pojedyncza.rodzaj, pojedyncza.tor);
        super.numer = pojedyncza.numer;
        super.iloscSprzetu = pojedyncza.iloscSprzetu;
        super.anulowana = pojedyncza.anulowana;
        this.czyPelnoletni = pojedyncza.czyPelnoletni;
        this.numerOpiekuna = pojedyncza.numerOpiekuna;
    }

    @Override
    public String toString() {
        if(anulowana){
            return "Anulowana";
        }else{
            return "Pojedyncza: " + dataRezerwacji;
        }
    }

}
