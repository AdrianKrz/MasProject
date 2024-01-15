package klasy.Tory;

import klasy.Basen;

public class TorZPrzeszkodami extends Tor {
    int iloscPrzeszkod;
    int iloscLinDoWspinaczki;
    int iloscWejsc;
    String nazwa;
    String poziomTrudnosci;

    private TorZPrzeszkodami(Basen basen, double glebokosc, String rodzaj, boolean czyWolny, int iloscPrzeszkod, int iloscLinDoWspinaczki, int iloscWejsc, String nazwa, String poziomTrudnosci) {
        super(basen, glebokosc, rodzaj, czyWolny);
        this.iloscPrzeszkod = iloscPrzeszkod;
        this.iloscLinDoWspinaczki = iloscLinDoWspinaczki;
        this.iloscWejsc = iloscWejsc;
        this.nazwa = nazwa;
        this.poziomTrudnosci = poziomTrudnosci;
    }
    private TorZPrzeszkodami(TorZPrzeszkodami torZPrzeszkodami) {
        super(torZPrzeszkodami.basen, torZPrzeszkodami.glebokosc, torZPrzeszkodami.rodzaj, torZPrzeszkodami.czyWolny);
        super.numer = torZPrzeszkodami.numer;
        this.iloscPrzeszkod = torZPrzeszkodami.iloscPrzeszkod;
        this.iloscLinDoWspinaczki = torZPrzeszkodami.iloscLinDoWspinaczki;
        this.iloscWejsc = torZPrzeszkodami.iloscWejsc;
        this.nazwa = torZPrzeszkodami.nazwa;
        this.poziomTrudnosci = torZPrzeszkodami.poziomTrudnosci;
    }


    public static TorZPrzeszkodami createTor(Basen basen, double glebokosc, String rodzaj, boolean czyWolny, int iloscPrzeszkod, int iloscLinDoWspinaczki, int iloscWejsc, String nazwa, String poziomTrudnosci) throws Exception {
        if(basen == null){
            throw new Exception("Basen nie istnieje");
        }
        TorZPrzeszkodami tor = new TorZPrzeszkodami(basen, glebokosc, rodzaj, czyWolny, iloscPrzeszkod, iloscLinDoWspinaczki, iloscWejsc, nazwa, poziomTrudnosci);
        basen.addTor(tor);

        return tor;
    }
    public static TorZPrzeszkodami createTor(TorZPrzeszkodami torZPrzeszkodami) throws Exception {
        if(torZPrzeszkodami.basen == null){
            throw new Exception("Basen nie istnieje");
        }
        TorZPrzeszkodami tor = new TorZPrzeszkodami(torZPrzeszkodami);

        return tor;
    }
    public void aktualizacjaPrzeszkod(){}
    @Override
    public String toString() {
        return "Tor z przeszkodami";
    }
}
