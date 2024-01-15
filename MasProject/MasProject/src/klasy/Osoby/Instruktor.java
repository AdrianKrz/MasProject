package klasy.Osoby;

import klasy.Osoby.Osoba;
import klasy.Rezerwacje.Rezerwacja;

import java.util.ArrayList;
import java.util.List;

public class Instruktor extends Osoba {
    String dataZatrudnienia;
    int staz;
    String specjalizacja;
    boolean czyWolny;
    List<Rezerwacja> rezerwacje = new ArrayList<>();


    public Instruktor(String imie, String nazwisko, String pesel, String numerTel, String dataZatrudnienia, int staz, String specjalizacja, boolean czyWolny) {
        super(imie, nazwisko, pesel, numerTel);
        this.dataZatrudnienia = dataZatrudnienia;
        this.staz = staz;
        this.specjalizacja = specjalizacja;
        this.czyWolny = czyWolny;
    }
    public Instruktor(Instruktor instruktor){
        super(instruktor.imie, instruktor.nazwisko, instruktor.pesel, instruktor.numerTel);
        this.dataZatrudnienia = instruktor.dataZatrudnienia;
        this.staz = instruktor.staz;
        this.specjalizacja = instruktor.specjalizacja;
        this.czyWolny = instruktor.czyWolny;
        this.rezerwacje = instruktor.rezerwacje;
    }


    public void zwolnijIntruktora(){}

    public static void listInstruktorow(){}

    public boolean CzyWolny() {
        return czyWolny;
    }

    public String specjalizacja() {
        return specjalizacja;
    }

    public void addRezerwacja(Rezerwacja rezerwacja){
        rezerwacje.add(rezerwacja);
    }

    public void setZajety(){
        czyWolny = false;
    }
    public void setWolny(){
        czyWolny = true;
    }

    public static void Info(int id){
        System.out.println(Osoba.extent.get(id));
    }
    public void infoRezerwacja(){
        System.out.println(imie + " " + nazwisko + " rezerwacje: " + rezerwacje + ", id: " + numer);
    }
    @Override
    public String toString() {
        return imie + " " + nazwisko + " specjalizacja: " + specjalizacja + ", id: " + numer;
    }
}
