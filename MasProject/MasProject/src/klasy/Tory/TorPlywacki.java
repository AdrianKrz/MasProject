package klasy.Tory;

import klasy.Basen;

public class TorPlywacki extends Tor {
    int dlugosc;
    String kolorKoralikow;
    boolean czyDoSzybkiegoPlywania;

    private TorPlywacki(Basen basen, double glebokosc, String rodzaj, boolean czyWolny, int dlugosc, String kolorKoralikow, boolean czyDoSzybkiegoPlywania) {
        super(basen, glebokosc, rodzaj, czyWolny);
        this.dlugosc = dlugosc;
        this.kolorKoralikow = kolorKoralikow;
        this.czyDoSzybkiegoPlywania = czyDoSzybkiegoPlywania;
    }
    private TorPlywacki(TorPlywacki torPlywacki) {
        super(torPlywacki.basen, torPlywacki.glebokosc, torPlywacki.rodzaj, torPlywacki.czyWolny);
        super.numer = torPlywacki.numer;
        this.dlugosc = torPlywacki.dlugosc;
        this.kolorKoralikow = torPlywacki.kolorKoralikow;
        this.czyDoSzybkiegoPlywania = torPlywacki.czyDoSzybkiegoPlywania;
    }

    public static TorPlywacki createTor(Basen basen, double glebokosc, String rodzaj, boolean czyWolny, int dlugosc, String kolorKoralikow, boolean czyDoSzybkiegoPlywania) throws Exception {
        if(basen == null){
            throw new Exception("Basen nie istnieje");
        }
        TorPlywacki tor = new TorPlywacki(basen, glebokosc, rodzaj, czyWolny, dlugosc, kolorKoralikow, czyDoSzybkiegoPlywania);
        basen.addTor(tor);

        return tor;
    }
    public static TorPlywacki createTor(TorPlywacki torPlywacki) throws Exception {
        if(torPlywacki.basen == null){
            throw new Exception("Basen nie istnieje");
        }
        TorPlywacki tor = new TorPlywacki(torPlywacki);

        return tor;
    }

    @Override
    public String toString() {
        return "Tor plywacki";
    }
}
