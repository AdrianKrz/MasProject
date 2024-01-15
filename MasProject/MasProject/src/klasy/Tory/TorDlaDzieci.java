package klasy.Tory;

import klasy.Basen;

public class TorDlaDzieci extends Tor {
    int iloscBojek;
    String nazwa;

    private TorDlaDzieci(Basen basen, double glebokosc, String rodzaj, boolean czyWolny, int iloscBojek, String nazwa) {
        super(basen, glebokosc, rodzaj, czyWolny);
        this.iloscBojek = iloscBojek;
        this.nazwa = nazwa;
    }
    private TorDlaDzieci(TorDlaDzieci torDlaDzieci) {
        super(torDlaDzieci.basen, torDlaDzieci.glebokosc, torDlaDzieci.rodzaj, torDlaDzieci.czyWolny);
        super.numer = torDlaDzieci.numer;
        this.iloscBojek = torDlaDzieci.iloscBojek;
        this.nazwa = torDlaDzieci.nazwa;
    }
    public static TorDlaDzieci createTor(Basen basen, double glebokosc, String rodzaj, boolean czyWolny, int iloscBojek, String nazwa) throws Exception {
        if(basen == null){
            throw new Exception("Basen nie istnieje");
        }
        TorDlaDzieci tor = new TorDlaDzieci(basen, glebokosc, rodzaj, czyWolny, iloscBojek, nazwa);
        basen.addTor(tor);

        return tor;
    }
    public static TorDlaDzieci createTor(TorDlaDzieci torDlaDzieci) throws Exception {
        if(torDlaDzieci.basen == null){
            throw new Exception("Basen nie istnieje");
        }
        TorDlaDzieci tor = new TorDlaDzieci(torDlaDzieci);

        return tor;
    }

    @Override
    public String toString() {
        return "Tor dla dzieci";
    }
}
