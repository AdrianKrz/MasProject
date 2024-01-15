package klasy;

import klasy.Osoby.PrezesKlubuSportowego;
import klasy.Sprzet.SprzetPlywacki;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class KlubSportowy implements Serializable {
    int numer;
    String nazwaKlubu;
    int iloscDzieci;
    String miasto;
    long nip;
    int iloscMedaliMistrzowskich;
    PrezesKlubuSportowego prezes;
    private static Map<Integer, KlubSportowy> extent = new TreeMap<>();

    public KlubSportowy(String nazwaKlubu, int iloscDzieci, String miasto, long nip, int iloscMedaliMistrzowskich) {
        this.nazwaKlubu = nazwaKlubu;
        this.iloscDzieci = iloscDzieci;
        this.miasto = miasto;
        this.nip = nip;
        this.iloscMedaliMistrzowskich = iloscMedaliMistrzowskich;

        this.numer = KlubSportowy.getExtentSize() + 1;
        extent.put(this.numer, this);
    }

    public KlubSportowy(KlubSportowy klub) {
        this.nazwaKlubu = klub.nazwaKlubu;
        this.iloscDzieci = klub.iloscDzieci;
        this.miasto = klub.miasto;
        this.nip = klub.nip;
        this.iloscMedaliMistrzowskich = klub.iloscMedaliMistrzowskich;

        this.numer = klub.numer;
        extent.put(this.numer, this);
    }

    public void setPrezes(PrezesKlubuSportowego prezes) {
        if(this.prezes != prezes){
            this.prezes = prezes;
            this.prezes.setKlub(this);
        }
    }

    public static KlubSportowy rodzaj(int id){
        return extent.get(id);
    }

    public static int getExtentSize(){
        return extent.size();
    }
    public static void Info(int id){
        System.out.println(extent.get(id));
    }

    @Override
    public String toString() {
        return "KlubSportowy, nazwa: " + nazwaKlubu;
    }
}
