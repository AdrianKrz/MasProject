package klasy.Rezerwacje;

import klasy.Basen;
import klasy.Osoby.Instruktor;
import klasy.Osoby.Klient;
import klasy.Osoby.PrezesKlubuSportowego;
import klasy.Osoby.Prywatny;
import klasy.Sprzet.SprzetPlywacki;
import klasy.Tory.Tor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class Rezerwacja implements Serializable {
    int numer;
    String dataRezerwacji;
    Prywatny prywatny = null;
    PrezesKlubuSportowego prezesKlubuSportowego = null;
    Tor tor;
    Instruktor instruktor;
    List<Integer> iloscSprzetu = new ArrayList<>();
    String rodzaj;
    boolean anulowana = false;
    private static Map<Integer, Rezerwacja> extent = new TreeMap<>();
    public Rezerwacja(String dataRezerwacji,
                      Prywatny prywatny, Instruktor instruktor,
                      String rodzaj, Tor tor) {
        this.dataRezerwacji = dataRezerwacji;
        this.prywatny = prywatny;
        this.instruktor = instruktor;
        this.instruktor.addRezerwacja(this);
        this.rodzaj = rodzaj;
        this.tor = tor;
        this.numer = Rezerwacja.getExtentSize() + 1;
        extent.put(this.numer, this);
    }
    public Rezerwacja(String dataRezerwacji,
                      PrezesKlubuSportowego prezesKlubuSportowego, Instruktor instruktor,
                      String rodzaj, Tor tor) {
        this.dataRezerwacji = dataRezerwacji;
        this.prezesKlubuSportowego = prezesKlubuSportowego;
        this.instruktor = instruktor;
        this.instruktor.addRezerwacja(this);
        this.instruktor.addRezerwacja(this);
        this.rodzaj = rodzaj;
        this.tor = tor;
        this.numer = Rezerwacja.getExtentSize() + 1;
        extent.put(this.numer, this);
    }

    public void infoInstruktor(){
        if(anulowana){
            System.out.println("Anulowana");
        }else{
            System.out.println("Rezerwacja id: " + numer + ", instruktor: " +instruktor.toString());

        }
    }
    public void addSprzet(int ilosc){
        iloscSprzetu.add(ilosc);
    }
    public static Rezerwacja rodzaj(int id){
        return extent.get(id);
    }
    public static int getExtentSize(){
        return extent.size();
    }


    public Prywatny getPrywatny() {
        return prywatny;
    }

    public static void usunAnulowaneRezerwacje(){}
    public static void przyjmijRezerwacje(){}

    public void anulujRezerwacje(){
        this.anulowana = true;
        this.tor.setWolny();
        this.instruktor.setWolny();
        for (int i = 0; i < tor.listaSprzetu().size() -1; i++) {
            tor.listaSprzetu().get(i).dodajIlosc(iloscSprzetu.get(i));
        }
    }

    public static void Info(int id){
        System.out.println(extent.get(id));
    }
    public void infoCalosc(){
        if(anulowana){
            System.out.println("Anulowana");
        }else{
            if(prywatny != null)
                System.out.println("Klient: " + prywatny + " oraz tor: " + tor);
            else
                System.out.println("Klient: " + prezesKlubuSportowego + " oraz tor: " + tor);

        }
    }
}
