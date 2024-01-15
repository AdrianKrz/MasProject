package klasy.Sprzet;

import klasy.Sprzet.SprzetPlywacki;

public class KapokDlaDzieci extends SprzetPlywacki {
    String rozmiar;
    String kolor;
    int iloscRekawkow;

    public KapokDlaDzieci(boolean czyWolny, int ilosc, String rozmiar, String kolor, int iloscRekawkow) {
        super(czyWolny, ilosc);
        this.rozmiar = rozmiar;
        this.kolor = kolor;
        this.iloscRekawkow = iloscRekawkow;
    }

    public KapokDlaDzieci(KapokDlaDzieci kapokDlaDzieci) {
        super(kapokDlaDzieci.czyWolny, kapokDlaDzieci.ilosc);
        super.numer = kapokDlaDzieci.numer;
        super.iloscDoWykorzystania = kapokDlaDzieci.iloscDoWykorzystania;
        super.tory = kapokDlaDzieci.tory;
        this.rozmiar = kapokDlaDzieci.rozmiar;
        this.kolor = kapokDlaDzieci.kolor;
        this.iloscRekawkow = kapokDlaDzieci.iloscRekawkow;
    }

    @Override
    public String toString() {
        return "Kapok dla dzieci, dostepna ilosc: " + iloscDoWykorzystania;
    }
}
