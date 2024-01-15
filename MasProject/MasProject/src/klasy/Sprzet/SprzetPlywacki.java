package klasy.Sprzet;

import klasy.Tory.Tor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class SprzetPlywacki implements Serializable {
    int numer;
    boolean czyWolny;
    int ilosc;
    int iloscDoWykorzystania;
    List<Tor> tory = new ArrayList<>();
    private static Map<Integer, SprzetPlywacki> extent = new TreeMap<>();

    public SprzetPlywacki(boolean czyWolny, int ilosc) {
        this.czyWolny = czyWolny;
        this.ilosc = ilosc;
        this.iloscDoWykorzystania = ilosc;
        this.numer = SprzetPlywacki.getExtentSize() + 1;
        extent.put(this.numer, this);
    }

    public void addTor(Tor tor){
        if(!tory.contains(tor)){
            tory.add(tor);

            tor.addSprzet(this);
        }
    }

    public void dodajIlosc(int i){
        this.iloscDoWykorzystania = this.iloscDoWykorzystania + i;
    }

    public void removeTor(Tor tor){
        if(tory.contains(tor)){
            tory.remove(tor);
            tor.removeSprzet(this);
        }
    }
    public void czyWolny(){}
    public void dodajNowySprzet(){}
    public void infoTor(){
        System.out.println("Tory na ktorych jest dyspozycja sprzetu: " + tory);
    }
    public static SprzetPlywacki rodzaj(int id){
        return extent.get(id);
    }

    public static int getExtentSize(){
        return extent.size();
    }
    public static void Info(int id){
        System.out.println(extent.get(id));
    }


    public int getIloscDoWykorzystania() {
        return iloscDoWykorzystania;
    }
    public void odejmijZeStanu(int i){
        this.iloscDoWykorzystania = this.iloscDoWykorzystania - i;
    }
}
