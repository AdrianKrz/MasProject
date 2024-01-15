package klasy.Sprzet;



public class Makaron extends SprzetPlywacki {
    String kolor;
    int dlugosc;
    String material;

    public Makaron(boolean czyWolny, int ilosc, String kolor, int dlugosc, String material) {
        super(czyWolny, ilosc);
        this.kolor = kolor;
        this.dlugosc = dlugosc;
        this.material = material;
    }

    public Makaron(Makaron makaron) {
        super(makaron.czyWolny, makaron.ilosc);
        super.numer = makaron.numer;
        super.iloscDoWykorzystania = makaron.iloscDoWykorzystania;
        super.tory = makaron.tory;
        this.kolor = makaron.kolor;
        this.dlugosc = makaron.dlugosc;
        this.material = makaron.material;
    }

    @Override
    public String toString() {
        return "Makaron, dostepna ilosc: " + iloscDoWykorzystania;
    }


}
