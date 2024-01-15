package gui;

import klasy.Osoby.Instruktor;
import klasy.Osoby.PrezesKlubuSportowego;
import klasy.Osoby.Prywatny;
import klasy.Tory.Tor;

public class DaneDoRezerwacji {
    private static String rodzajRezerwacji;
    private static String rodzajKlienta;
    private static String rodzaj;
    private static String dataRezerwacji;
    private static Prywatny prywatny;
    private static PrezesKlubuSportowego Prezes;
    private static Tor tor;
    private static Instruktor instruktor;

    //sprzet
    private static int iloscMakaronow;
    private static int iloscOkularow;
    private static int iloscKapokow;


    //Dla rodzinnej
    private static int iloscDzieciNiepelnoletnich;
    private static boolean czyRodzinUmiePlywac;
    private static double znizka;
    private static int iloscOsobWRodzinnej;

    //dla grupowej
    private static String poziomZaawansowania;
    private static int iloscOsobWGrupowej;

    //dla pojedynczej
    private static String numerOpiekuna;

    //dla sportowej
    private static int iloscOsobDlaSportowej;
    private static boolean dostepDoSlupkow;
    private static boolean miejsceNaSprzet;


    public static int getIloscMakaronow() {
        return iloscMakaronow;
    }

    public static void setIloscMakaronow(int iloscMakaronow) {
        DaneDoRezerwacji.iloscMakaronow = iloscMakaronow;
    }

    public static int getIloscOkularow() {
        return iloscOkularow;
    }

    public static void setIloscOkularow(int iloscOkularow) {
        DaneDoRezerwacji.iloscOkularow = iloscOkularow;
    }

    public static int getIloscKapokow() {
        return iloscKapokow;
    }

    public static void setIloscKapokow(int iloscKapokow) {
        DaneDoRezerwacji.iloscKapokow = iloscKapokow;
    }

    public static String getRodzajRezerwacji() {
        return rodzajRezerwacji;
    }

    public static void setRodzajRezerwacji(String rodzajRezerwacji) {
        DaneDoRezerwacji.rodzajRezerwacji = rodzajRezerwacji;
    }

    public static String getRodzajKlienta() {
        return rodzajKlienta;
    }

    public static void setRodzajKlienta(String rodzajKlienta) {
        DaneDoRezerwacji.rodzajKlienta = rodzajKlienta;
    }

    public static String getRodzaj() {
        return rodzaj;
    }

    public static void setRodzaj(String rodzaj) {
        DaneDoRezerwacji.rodzaj = rodzaj;
    }

    public static String getDataRezerwacji() {
        return dataRezerwacji;
    }

    public static void setDataRezerwacji(String dataRezerwacji) {
        DaneDoRezerwacji.dataRezerwacji = dataRezerwacji;
    }

    public static Prywatny getPrywatny() {
        return prywatny;
    }

    public static void setPrywatny(Prywatny prywatny) {
        DaneDoRezerwacji.prywatny = prywatny;
    }

    public static PrezesKlubuSportowego getPrezes() {
        return Prezes;
    }

    public static void setPrezes(PrezesKlubuSportowego prezes) {
        Prezes = prezes;
    }

    public static Tor getTor() {
        return tor;
    }

    public static void setTor(Tor tor) {
        DaneDoRezerwacji.tor = tor;
    }

    public static Instruktor getInstruktor() {
        return instruktor;
    }

    public static void setInstruktor(Instruktor instruktor) {
        DaneDoRezerwacji.instruktor = instruktor;
    }

    public static int getIloscDzieciNiepelnoletnich() {
        return iloscDzieciNiepelnoletnich;
    }

    public static void setIloscDzieciNiepelnoletnich(int iloscDzieciNiepelnoletnich) {
        DaneDoRezerwacji.iloscDzieciNiepelnoletnich = iloscDzieciNiepelnoletnich;
    }

    public static boolean isCzyRodzinUmiePlywac() {
        return czyRodzinUmiePlywac;
    }

    public static void setCzyRodzinUmiePlywac(boolean czyRodzinUmiePlywac) {
        DaneDoRezerwacji.czyRodzinUmiePlywac = czyRodzinUmiePlywac;
    }

    public static double getZnizka() {
        return znizka;
    }

    public static void setZnizka(double znizka) {
        DaneDoRezerwacji.znizka = znizka;
    }

    public static int getIloscOsobWRodzinnej() {
        return iloscOsobWRodzinnej;
    }

    public static void setIloscOsobWRodzinnej(int iloscOsobWRodzinnej) {
        DaneDoRezerwacji.iloscOsobWRodzinnej = iloscOsobWRodzinnej;
    }

    public static String getPoziomZaawansowania() {
        return poziomZaawansowania;
    }

    public static void setPoziomZaawansowania(String poziomZaawansowania) {
        DaneDoRezerwacji.poziomZaawansowania = poziomZaawansowania;
    }

    public static int getIloscOsobWGrupowej() {
        return iloscOsobWGrupowej;
    }

    public static void setIloscOsobWGrupowej(int iloscOsobWGrupowej) {
        DaneDoRezerwacji.iloscOsobWGrupowej = iloscOsobWGrupowej;
    }

    public static String getNumerOpiekuna() {
        return numerOpiekuna;
    }

    public static void setNumerOpiekuna(String numerOpiekuna) {
        DaneDoRezerwacji.numerOpiekuna = numerOpiekuna;
    }

    public static int getIloscOsobDlaSportowej() {
        return iloscOsobDlaSportowej;
    }

    public static void setIloscOsobDlaSportowej(int iloscOsobDlaSportowej) {
        DaneDoRezerwacji.iloscOsobDlaSportowej = iloscOsobDlaSportowej;
    }

    public static boolean isDostepDoSlupkow() {
        return dostepDoSlupkow;
    }

    public static void setDostepDoSlupkow(boolean dostepDoSlupkow) {
        DaneDoRezerwacji.dostepDoSlupkow = dostepDoSlupkow;
    }

    public static boolean isMiejsceNaSprzet() {
        return miejsceNaSprzet;
    }

    public static void setMiejsceNaSprzet(boolean miejsceNaSprzet) {
        DaneDoRezerwacji.miejsceNaSprzet = miejsceNaSprzet;
    }
}
