package klasy.Osoby;

import klasy.Sprzet.SprzetPlywacki;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public abstract class Osoba implements Serializable {
    static Map<Integer, Osoba> extent = new TreeMap<>();
    int numer;
    String imie;
    String nazwisko;
    String pesel;
    String numerTel;
    public Osoba(String imie, String nazwisko, String pesel, String numerTel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.numerTel = numerTel;


        this.numer = Osoba.getExtentSize() + 1;
        extent.put(this.numer, this);
    }


    public static void Info(int id){
        System.out.println(extent.get(id));
    }
    public static Osoba rodzaj(int id){
        return extent.get(id);
    }

    public static int getExtentSize(){
        return extent.size();
    }


    public int getNumer() {
        return numer;
    }
}
