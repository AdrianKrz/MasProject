package klasy.Osoby;


import klasy.Tory.Tor;

import java.util.ArrayList;
import java.util.List;

public class Ratownik extends Osoba {

    String dataZakonczeniaLicencji;
    int doswiadczenie;
    double wynagrodzenie;

    private List<Tor> tory = new ArrayList<>();

    public Ratownik(String imie, String nazwisko, String pesel, String numerTel, String dataZakonczeniaLicencji, int doswiadczenie, double wynagrodzenie) {
        super(imie, nazwisko, pesel, numerTel);
        this.dataZakonczeniaLicencji = dataZakonczeniaLicencji;
        this.doswiadczenie = doswiadczenie;
        this.wynagrodzenie = wynagrodzenie;
    }
    public Ratownik(Ratownik ratownik) {
        super(ratownik.imie, ratownik.nazwisko, ratownik.pesel, ratownik.numerTel);
        super.numer = ratownik.numer;
        this.dataZakonczeniaLicencji = ratownik.dataZakonczeniaLicencji;
        this.doswiadczenie = ratownik.doswiadczenie;
        this.wynagrodzenie = ratownik.wynagrodzenie;
        this.tory = ratownik.tory;
    }



    public void addTor(Tor tor){
        if(!tory.contains(tor)){
            tory.add(tor);

            tor.addRatownik(this);
        }
    }

    public void removeTor(Tor tor){
        if(tory.contains(tor)){
            tory.remove(tor);
            tor.removeRatownik(this);
        }
    }
    public void odnowienieLicencji(){}
    public String info(){
        return imie + " " + nazwisko + " id: " + numer;
    }

    @Override
    public String toString() {
        return "Ratownik: " + "tory obowiazujace: " + tory + ", id: " + numer;
    }

}
