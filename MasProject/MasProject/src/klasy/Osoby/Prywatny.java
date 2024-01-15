package klasy.Osoby;


public class Prywatny extends Klient {
    String miasto;
    String statusSpoleczny;

    public Prywatny(String imie, String nazwisko, String pesel, String numerTel, int wiek, String numberDowodu, String rodzaj, String miasto, String statusSpoleczny) {
        super(imie, nazwisko, pesel, numerTel, wiek, numberDowodu, rodzaj);
        this.miasto = miasto;
        this.statusSpoleczny = statusSpoleczny;
    }

    public Prywatny(Prywatny prywatny) {
        super(prywatny.imie, prywatny.nazwisko, prywatny.pesel, prywatny.numerTel, prywatny.wiek, prywatny.numberDowodu, prywatny.rodzaj);
        super.numer = prywatny.numer;
        this.miasto = prywatny.miasto;
        this.statusSpoleczny = prywatny.statusSpoleczny;
    }

    public String getMiasto() {
        return miasto;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " id: " + numer;
    }


}
