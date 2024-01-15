package klasy.Tory;

import klasy.Basen;
import klasy.Osoby.Osoba;
import klasy.Osoby.Ratownik;
import klasy.Sprzet.SprzetPlywacki;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class Tor implements Serializable {
    int numer;
    double glebokosc;
    String rodzaj;
    boolean czyWolny;
    Basen basen;
    private List<Ratownik> ratownicy = new ArrayList<>();
    private List<SprzetPlywacki> sprzety = new ArrayList<>();
    private static Map<Integer, Tor> extent = new TreeMap<>();

    protected Tor(Basen basen, double glebokosc, String rodzaj, boolean czyWolny) {
        this.glebokosc = glebokosc;
        this.rodzaj = rodzaj;
        this.czyWolny = czyWolny;
        this.basen = basen;
        this.numer = Tor.getExtentSize() + 1;

        extent.put(this.numer, this);
    }

    public boolean czyWolny() {
        return czyWolny;
    }
    public void infoSprzet(){
        System.out.println("Sprzet dostepny na torze: " + sprzety);
    }
    public List<SprzetPlywacki> listaSprzetu(){
        return sprzety;
    }
    public void addSprzet(SprzetPlywacki sprzet){
        if(!sprzety.contains(sprzet)){
            sprzety.add(sprzet);

            sprzet.addTor(this);
        }
    }

    public void removeSprzet(SprzetPlywacki sprzet){
        if(sprzety.contains(sprzet)){
            sprzety.remove(sprzet);
            sprzet.removeTor(this);
        }
    }


    public void addRatownik(Ratownik ratownik){
        if(!ratownicy.contains(ratownik)){
            ratownicy.add(ratownik);

            ratownik.addTor(this);
        }
    }

    public void removeRatownik(Ratownik ratownik){
        if(ratownicy.contains(ratownik)){
            ratownicy.remove(ratownik);
            ratownik.removeTor(this);
        }
    }

    public void infoRatownik(){
        for (Ratownik ratownik : this.ratownicy) {
            System.out.println("Ratownik na torze " + rodzaj + ": " + ratownik.info());
        }
    }



    public static Tor rodzaj(int id){
        return extent.get(id);
    }

    public static int getExtentSize(){
        return extent.size();
    }
    public static void Info(int id){
        System.out.println(extent.get(id));
    }
    public void setZajety(){
        czyWolny = false;
    }
    public void setWolny(){
        czyWolny = true;
    }



}
