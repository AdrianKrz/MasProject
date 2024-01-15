package klasy.Osoby;

import klasy.Osoby.Osoba;

public abstract class Klient extends Osoba {
    int wiek;
    String numberDowodu;
    String rodzaj;

    public Klient(String imie, String nazwisko, String pesel, String numerTel, int wiek, String numberDowodu, String rodzaj) {
        super(imie, nazwisko, pesel, numerTel);
        this.wiek = wiek;
        this.numberDowodu = numberDowodu;
        this.rodzaj = rodzaj;
    }

    public int getWiek() {
        return wiek;
    }
    public void dodajKlienta(){}
    public void rezerwacjeKlienta(){}


}
