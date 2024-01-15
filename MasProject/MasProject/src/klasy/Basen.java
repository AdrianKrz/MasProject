package klasy;


import klasy.Sprzet.SprzetPlywacki;
import klasy.Tory.Tor;

import java.io.Serializable;
import java.util.*;

public class Basen implements Serializable {
    int numer;
    String adres;
    private List<Tor> tory = new ArrayList<>();
    private static Set<Tor> allTory = new HashSet<>();
    boolean czyMoznaOrganizowacZawody;
    private static Map<Integer, Basen> extent = new TreeMap<>();
    public Basen(String adres, boolean czyMoznaOrganizowacZawody) {
        this.adres = adres;
        this.czyMoznaOrganizowacZawody = czyMoznaOrganizowacZawody;
        this.numer = Basen.getExtentSize() + 1;
        extent.put(this.numer, this);
    }

    public void tory(){
        System.out.println("Tory na basenie: " + tory);
    }

    public Basen(Basen basen) {
        this.adres = basen.adres;
        this.czyMoznaOrganizowacZawody = basen.czyMoznaOrganizowacZawody;
        this.tory = basen.tory;
        this.numer = basen.numer;
        for (Tor tor : tory) {
            allTory.add(tor);
        }
        extent.put(this.numer, this);
    }

    public void addTor(Tor tor) throws Exception {
        if(!tory.contains(tor)){
            if(allTory.contains(tor)){
                throw new Exception("");
            }else {
                tory.add(tor);
                allTory.add(tor);
            }
        }
    }

    public void removeTor(Tor tor){
        if(tory.contains(tor)){
            tory.remove(tor);
            allTory.remove(tor);
        }
    }

    public void listaTorowNaBasenie(){}
    public static Basen rodzaj(int id){
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
        return adres + " tory do dyspozycji: " + tory;
    }
}
