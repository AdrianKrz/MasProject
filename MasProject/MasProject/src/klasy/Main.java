package klasy;

import gui.DaneDoRezerwacji;
import gui.WidokPoczatkowy;
import klasy.Osoby.*;

import klasy.Rezerwacje.*;
import klasy.Sprzet.KapokDlaDzieci;
import klasy.Sprzet.Makaron;
import klasy.Sprzet.OkularyPlywacki;
import klasy.Sprzet.SprzetPlywacki;
import klasy.Tory.Tor;
import klasy.Tory.TorDlaDzieci;
import klasy.Tory.TorPlywacki;
import klasy.Tory.TorZPrzeszkodami;

import javax.swing.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        odczyt();

//        //Tworzymy instruktorów:
//        Instruktor in1 = new Instruktor("Jakub", "Piech", "65947235184", "456789123", "10.02.2020", 2, "TorZPrzeszkodami", true);
//        Instruktor in2 = new Instruktor("Michal", "Zalewski", "45678912334", "321897564", "10.02.2020", 2, "TorZPrzeszkodami", true);
//        Instruktor in3 = new Instruktor("Marcin", "Kowalski", "65489732159", "654897321", "10.02.2020", 1, "TorDlaDzieci", true);
//        Instruktor in4 = new Instruktor("Konrad", "Niewiadomski", "78965412382", "159486237", "10.02.2020", 1, "TorPlywacki", true);
//        Instruktor in5 = new Instruktor("Adrian", "Zalecki", "15935745698", "945872136", "10.02.2020", 2, "TorPlywacki", true);
//
//        //Tworzymy Ratownikow:
//        Ratownik rat1 = new Ratownik("Franek", "Krzywnicki", "15948765418", "958746522", "10.04.2023", 4, 3500);
//        Ratownik rat2 = new Ratownik("Konrad", "Kawecki", "95874589658", "154873655", "10.04.2023", 4, 3500);
//        Ratownik rat3 = new Ratownik("Tadeusz", "Powalka", "87459632314", "987987987", "10.04.2023", 4, 3500);
//        Ratownik rat4 = new Ratownik("Oliwier", "Kolendra", "54879512655", "219754413", "10.04.2023", 4, 3500);
//        Ratownik rat5 = new Ratownik("Sebastian", "Niewiadomski", "84156289857", "123485468", "10.04.2023", 4, 3500);
//
//        //Tworzymy Klienta Prywatnego:
//        Prywatny pry1 = new Prywatny("Marcin", "Majkut", "98745612321", "498653254", 17, "SUG5468", "Prywatny", "Warszawa", "Singiel");
//        Prywatny pry2 = new Prywatny("Adrian", "Milowski", "95844615361", "958746523", 22, "DAD9845", "Prywatny", "Warszawa", "Singiel");
//        Prywatny pry3 = new Prywatny("Antoni", "Miecznikowski", "68545341561", "159874563", 22, "BOG4568", "Prywatny", "Warszawa", "Singiel");
//        Prywatny pry4 = new Prywatny("Filip", "Kwasiborski", "47894132155", "326598744", 22, "ABG8735", "Prywatny", "Warszawa", "Singiel");
//        Prywatny pry5 = new Prywatny("Andrzej", "Peplowski", "68744565251", "559755984", 22, "ZFA4568", "Prywatny", "Warszawa", "Singiel");
//
//        //Tworzymy Prezesa Klubu Sportowego:
//        PrezesKlubuSportowego prezes1 = new PrezesKlubuSportowego("Dariusz", "Zalewski", "78645641325", "998563215", 22, "BUH9875", "Prezes", 5, 6, 12);
//        PrezesKlubuSportowego prezes2 = new PrezesKlubuSportowego("Zbigniew", "Milowski", "54615612315", "225412235", 22, "SUG9968", "Prezes", 5, 6, 12);
//
//        //Tworzymy Klub Sportowy:
//        KlubSportowy klub1 = new KlubSportowy("Orka", 45, "Warszawa", 236547895, 12);
//        KlubSportowy klub2 = new KlubSportowy("G8", 22, "Ciechanow", 687478545, 65);
//
//        //Przypisujemy prezesów klubu:
//        klub1.setPrezes(prezes1);
//        klub2.setPrezes(prezes2);
//
//        //Tworzymy basen:
//        Basen basen = new Basen("Mazowiecka 33", true);
//
//        //Tworzymy tory na basen:
//        Tor torPl1 = TorPlywacki.createTor(basen, 3, "Plywacki", false, 25, "niebieski", true);
//        Tor torPl2 = TorPlywacki.createTor(basen, 3, "Plywacki", false, 25, "zolte", true);
//        Tor torZPrzeszkodami1 = TorZPrzeszkodami.createTor(basen, 2, "TorPlywacki", true, 9,3,4,"ZPrzeszkodami", "expert");
//        Tor torZPrzeszkodami2 = TorZPrzeszkodami.createTor(basen, 2, "TorPlywacki", true, 5,5,6,"ZPrzeszkodami", "expert");
//        Tor torDlaDzieci1 = TorDlaDzieci.createTor(basen, 1, "TorPlywacki", true, 3,"DlaDzieci");
//        Tor torDlaDzieci2 = TorDlaDzieci.createTor(basen, 1, "TorPlywacki", true, 32,"DlaDzieci");
//
//        //Torzymy Sprzęt pływacki:
//        SprzetPlywacki sprzet1 = new Makaron(true, 25, "Niebieski", 2, "Miekki");
//        SprzetPlywacki sprzet2 = new OkularyPlywacki(true, 20, "Szwedki", "biale", "S");
//        SprzetPlywacki sprzet3 = new KapokDlaDzieci(true, 30, "Niebieski", "zielony", 2);
//
//        //Dodajemy sprzęt do dyspozycji toru:
//        torPl1.addSprzet(sprzet1);
//        torPl1.addSprzet(sprzet2);
//        torPl1.addSprzet(sprzet3);
//        torPl1.addSprzet(sprzet1);
//        torPl1.addSprzet(sprzet2);
//        torPl2.addSprzet(sprzet3);
//        torZPrzeszkodami1.addSprzet(sprzet1);
//        torZPrzeszkodami1.addSprzet(sprzet2);
//        torZPrzeszkodami1.addSprzet(sprzet3);
//        torZPrzeszkodami2.addSprzet(sprzet1);
//        torZPrzeszkodami2.addSprzet(sprzet2);
//        torZPrzeszkodami2.addSprzet(sprzet3);
//        torDlaDzieci1.addSprzet(sprzet1);
//        torDlaDzieci1.addSprzet(sprzet2);
//        torDlaDzieci1.addSprzet(sprzet3);
//        torDlaDzieci2.addSprzet(sprzet1);
//        torDlaDzieci2.addSprzet(sprzet2);
//        torDlaDzieci2.addSprzet(sprzet3);
//
//        //Dodajemy ratownika do toru:
//        torPl1.addRatownik(rat1);
//        torPl2.addRatownik(rat2);
//        torZPrzeszkodami1.addRatownik(rat1);
//        torZPrzeszkodami2.addRatownik(rat3);
//        torDlaDzieci1.addRatownik(rat4);
//        torDlaDzieci2.addRatownik(rat5);
//
//
//        Rezerwacja rez1 = new Rodzinna("10.04.2001", pry1, in2, "Rodzinna", torPl2, 4, true, 0.5, 6);
//        rez1.addSprzet(2);
//        rez1.addSprzet(2);
//        rez1.addSprzet(2);
//        Rezerwacja rez2 = new Rodzinna("10.04.2001", pry1, in2, "Rodzinna", torPl1, 4, true, 0.5, 6);
//        rez1.anulujRezerwacje();

        //pokazanie asocjacji między Ratownik - Tor
        System.out.println("Ratownicy i ich tory: ");
        for(int i = 1; i <=Osoba.getExtentSize(); i++){
            if(Osoba.rodzaj(i) instanceof Ratownik){
                Osoba.Info(i);
            }
        }
        System.out.println();
        System.out.println("Tory i ich ratownicy: ");
        for(int i = 1; i <=Tor.getExtentSize(); i++){
            Tor.rodzaj(i).infoRatownik();
        }
        //pokazanie asocjacji między Tor - Sprzet plywacki
        System.out.println();
        System.out.println("Tor i ich dostepny sprzet: ");
        Tor.rodzaj(1).infoSprzet();
        System.out.println();
        System.out.println("Sprzet i ich tory na ktorych sa dostepne");
        for(int i = 1; i <= SprzetPlywacki.getExtentSize(); i++){
            SprzetPlywacki.rodzaj(i).infoTor();
        }
        //pokazanie asocjacji między Rezerwacja - Instruktor
        System.out.println();
        System.out.println("Instruktorzy i rezerwacje, ktore przeprowadzili:");
        for(int i = 1; i <=Osoba.getExtentSize(); i++){
            if(Osoba.rodzaj(i) instanceof Instruktor){
                ((Instruktor) Osoba.rodzaj(i)).infoRezerwacja();
            }
        }
        System.out.println();
        System.out.println("Rezerwacje i Instruktorzy, którzy uczestniczyli");
        for(int i = 1; i <=Rezerwacja.getExtentSize(); i++){
            Rezerwacja.rodzaj(i).infoInstruktor();
        }
        //pokazanie asocjacji z atrybutem(Rezerwacja) Klient - Tor
        System.out.println();
        System.out.println("Rezerwacje: ");
        for(int i = 1; i <=Rezerwacja.getExtentSize(); i++){
            Rezerwacja.rodzaj(i).infoCalosc();
        }

        new DaneDoRezerwacji();
        JFrame f = WidokPoczatkowy.widok();
        f.setVisible(true);
        zapis();
    }


    public static void zapis(){
        try {
            FileOutputStream fileOut = new FileOutputStream("dane.csv");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(int i = 1; i <= Basen.getExtentSize(); i++){
                out.writeObject(Basen.rodzaj(i));
            }
            for(int i = 1; i <= Tor.getExtentSize(); i++){
                out.writeObject(Tor.rodzaj(i));
            }
            for(int i = 1; i <= SprzetPlywacki.getExtentSize(); i++){
                out.writeObject(SprzetPlywacki.rodzaj(i));
            }
            for(int i = 1; i <= KlubSportowy.getExtentSize(); i++){
                out.writeObject(KlubSportowy.rodzaj(i));
            }
            for(int i = 1; i <= Osoba.getExtentSize(); i++){
                out.writeObject(Osoba.rodzaj(i));
            }
            for(int i = 1; i <= Rezerwacja.getExtentSize(); i++){
                out.writeObject(Rezerwacja.rodzaj(i));
            }

            out.close();
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void odczyt(){
        try {
            FileInputStream fileIn = new FileInputStream("dane.csv");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            try{
                Object obiekt;
                while((obiekt = in.readObject()) != null){
                    if(obiekt instanceof Instruktor) {
                        new Instruktor((Instruktor) obiekt);
                    }
                    if(obiekt instanceof Prywatny) {
                        new Prywatny((Prywatny) obiekt);
                    }
                    if(obiekt instanceof PrezesKlubuSportowego){
                        new PrezesKlubuSportowego((PrezesKlubuSportowego) obiekt);
                    }

                    if(obiekt instanceof Makaron){
                        new Makaron((Makaron) obiekt);
                    }

                    if(obiekt instanceof OkularyPlywacki){
                        new OkularyPlywacki((OkularyPlywacki) obiekt);
                    }

                    if(obiekt instanceof KapokDlaDzieci){
                        new KapokDlaDzieci((KapokDlaDzieci) obiekt);
                    }
                    if(obiekt instanceof Basen){
                        new Basen((Basen) obiekt);
                    }
                    if(obiekt instanceof KlubSportowy){
                        new KlubSportowy((KlubSportowy) obiekt);
                    }

                    if(obiekt instanceof TorPlywacki){
                        TorPlywacki.createTor((TorPlywacki) obiekt);
                    }

                    if(obiekt instanceof TorZPrzeszkodami){
                        TorZPrzeszkodami.createTor((TorZPrzeszkodami) obiekt);
                    }


                    if(obiekt instanceof TorDlaDzieci){
                        TorDlaDzieci.createTor((TorDlaDzieci) obiekt);
                    }

                    if(obiekt instanceof Ratownik){
                        new Ratownik((Ratownik) obiekt);
                    }

                    if(obiekt instanceof Grupowa){
                        new Grupowa((Grupowa) obiekt);
                    }
                    if(obiekt instanceof Pojedyncza){
                       new Pojedyncza((Pojedyncza) obiekt);
                    }
                    if(obiekt instanceof Rodzinna){
                        new Rodzinna((Rodzinna) obiekt);
                    }
                    if(obiekt instanceof Sportowa){
                        new Sportowa((Sportowa) obiekt);
                    }


                    System.out.println(obiekt);
                }
            }catch (EOFException ignored){}
            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
