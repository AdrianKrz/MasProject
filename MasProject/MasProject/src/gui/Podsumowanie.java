package gui;

import klasy.Main;
import klasy.Rezerwacje.*;
import klasy.Sprzet.SprzetPlywacki;

import javax.swing.*;
import java.awt.*;

public class Podsumowanie {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Nowa rezerwacja");




        JLabel b =new JLabel("Klient: ");
        b.setForeground(Color.WHITE);
        JLabel b3 =new JLabel("Rodzaj rezerwacji: ");
        b3.setForeground(Color.WHITE);
        JLabel b4 =new JLabel("Tor: ");
        b4.setForeground(Color.WHITE);
        JLabel b5 =new JLabel("Instruktor: ");
        b5.setForeground(Color.WHITE);
        JLabel b6 =new JLabel("Sprzęt: ");
        b6.setForeground(Color.WHITE);



        JTextArea j1 = new JTextArea();
        JTextArea j2 = new JTextArea();
        JTextArea j3 = new JTextArea();
        JTextArea j4 = new JTextArea();
        JTextArea j5 = new JTextArea();
        j1.setForeground(Color.WHITE);
        j2.setForeground(Color.WHITE);
        j3.setForeground(Color.WHITE);
        j4.setForeground(Color.WHITE);
        j5.setForeground(Color.WHITE);
        j1.setBackground(Color.BLACK);
        j2.setBackground(Color.BLACK);
        j3.setBackground(Color.BLACK);
        j4.setBackground(Color.BLACK);
        j5.setBackground(Color.BLACK);

        JButton b2 =new JButton("AKCEPTUJ");
        b2.setBackground(Color.WHITE);
        JButton b1 =new JButton("ANULUJ");
        b1.setBackground(Color.WHITE);

        JLabel jt2 = new JLabel("Podsumowanie: ");
        JLabel x = new JLabel();
        jt2.setForeground(Color.WHITE);
        if(DaneDoRezerwacji.getRodzajKlienta().equals("Prywatny")){
            j1.setText(DaneDoRezerwacji.getPrywatny().toString());
        }else {
            j1.setText(DaneDoRezerwacji.getPrezes().toString());
        }
        j2.setText(DaneDoRezerwacji.getRodzajRezerwacji());
        j3.setText(DaneDoRezerwacji.getTor().toString());
        j4.setText("Makaronow: " + DaneDoRezerwacji.getIloscMakaronow() + ", Okularow: " + DaneDoRezerwacji.getIloscOkularow() + ", kapokow: "+DaneDoRezerwacji.getIloscKapokow());
        j5.setText(DaneDoRezerwacji.getInstruktor().toString());
        b2.addActionListener(s -> {
            f.setVisible(false);
            if(DaneDoRezerwacji.getRodzajRezerwacji().equals("Rodzinna")){
                if(DaneDoRezerwacji.getRodzajKlienta().equals("Prywatny")){
                    Rezerwacja r = new Rodzinna(
                           DaneDoRezerwacji.getDataRezerwacji(),
                           DaneDoRezerwacji.getPrywatny(),
                           DaneDoRezerwacji.getInstruktor(),
                           DaneDoRezerwacji.getRodzaj(),
                           DaneDoRezerwacji.getTor(),
                           DaneDoRezerwacji.getIloscDzieciNiepelnoletnich(),
                           DaneDoRezerwacji.isCzyRodzinUmiePlywac(),
                           DaneDoRezerwacji.getZnizka(),
                           DaneDoRezerwacji.getIloscOsobWRodzinnej()
                    );
                    dodajSprzet(r,DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    odejmijZeStanu(DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    DaneDoRezerwacji.getTor().setZajety();
                    DaneDoRezerwacji.getInstruktor().setZajety();
                    Main.zapis();
                }else{
                    Rezerwacja r = new Rodzinna(
                            DaneDoRezerwacji.getDataRezerwacji(),
                            DaneDoRezerwacji.getPrezes(),
                            DaneDoRezerwacji.getInstruktor(),
                            DaneDoRezerwacji.getRodzaj(),
                            DaneDoRezerwacji.getTor(),
                            DaneDoRezerwacji.getIloscDzieciNiepelnoletnich(),
                            DaneDoRezerwacji.isCzyRodzinUmiePlywac(),
                            DaneDoRezerwacji.getZnizka(),
                            DaneDoRezerwacji.getIloscOsobWRodzinnej()
                    );

                    dodajSprzet(r,DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    odejmijZeStanu(DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    DaneDoRezerwacji.getTor().setZajety();
                    DaneDoRezerwacji.getInstruktor().setZajety();
                    Main.zapis();
                }
            }
            if(DaneDoRezerwacji.getRodzajRezerwacji().equals("Grupowa")){
                if(DaneDoRezerwacji.getRodzajKlienta().equals("Prywatny")){
                    Rezerwacja r = new Grupowa(
                            DaneDoRezerwacji.getDataRezerwacji(),
                            DaneDoRezerwacji.getPrywatny(),
                            DaneDoRezerwacji.getInstruktor(),
                            DaneDoRezerwacji.getDataRezerwacji(),
                            DaneDoRezerwacji.getTor(),
                            DaneDoRezerwacji.getPoziomZaawansowania(),
                            DaneDoRezerwacji.getIloscOsobWGrupowej()
                    );
                    dodajSprzet(r,DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    odejmijZeStanu(DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    DaneDoRezerwacji.getTor().setZajety();
                    DaneDoRezerwacji.getInstruktor().setZajety();
                    Main.zapis();
                }else{
                    Rezerwacja r = new Grupowa(
                            DaneDoRezerwacji.getDataRezerwacji(),
                            DaneDoRezerwacji.getPrezes(),
                            DaneDoRezerwacji.getInstruktor(),
                            DaneDoRezerwacji.getDataRezerwacji(),
                            DaneDoRezerwacji.getTor(),
                            DaneDoRezerwacji.getPoziomZaawansowania(),
                            DaneDoRezerwacji.getIloscOsobWGrupowej()
                    );
                    dodajSprzet(r,DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    odejmijZeStanu(DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    DaneDoRezerwacji.getTor().setZajety();
                    DaneDoRezerwacji.getInstruktor().setZajety();
                    Main.zapis();
                }

            }
            if(DaneDoRezerwacji.getRodzajRezerwacji().equals("Pojedyncza")){
                boolean czyPelnoletni;
                if(DaneDoRezerwacji.getPrywatny().getWiek() < 18){
                    czyPelnoletni = false;
                }else{
                    czyPelnoletni = true;
                }
                if(!czyPelnoletni){
                    Rezerwacja r = new Pojedyncza(
                            DaneDoRezerwacji.getDataRezerwacji(),
                            DaneDoRezerwacji.getPrywatny(),
                            DaneDoRezerwacji.getInstruktor(),
                            DaneDoRezerwacji.getRodzaj(),
                            DaneDoRezerwacji.getTor(),
                            czyPelnoletni,
                            DaneDoRezerwacji.getNumerOpiekuna()
                    );
                    dodajSprzet(r,DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    odejmijZeStanu(DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    DaneDoRezerwacji.getTor().setZajety();
                    DaneDoRezerwacji.getInstruktor().setZajety();
                    Main.zapis();
                }else{
                    Rezerwacja r = new Pojedyncza(
                            DaneDoRezerwacji.getDataRezerwacji(),
                            DaneDoRezerwacji.getPrywatny(),
                            DaneDoRezerwacji.getInstruktor(),
                            DaneDoRezerwacji.getRodzaj(),
                            DaneDoRezerwacji.getTor(),
                            czyPelnoletni
                    );
                    dodajSprzet(r,DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    odejmijZeStanu(DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                    DaneDoRezerwacji.getTor().setZajety();
                    DaneDoRezerwacji.getInstruktor().setZajety();
                    Main.zapis();
                }

            }
            if(DaneDoRezerwacji.getRodzajRezerwacji().equals("Sportowa")){
                Rezerwacja r = new Sportowa(
                        DaneDoRezerwacji.getDataRezerwacji(),
                        DaneDoRezerwacji.getPrezes(),
                        DaneDoRezerwacji.getInstruktor(),
                        DaneDoRezerwacji.getRodzaj(),
                        DaneDoRezerwacji.getTor(),
                        DaneDoRezerwacji.getIloscOsobDlaSportowej(),
                        DaneDoRezerwacji.isDostepDoSlupkow(),
                        DaneDoRezerwacji.isDostepDoSlupkow()
                );
                dodajSprzet(r,DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                odejmijZeStanu(DaneDoRezerwacji.getIloscMakaronow(),DaneDoRezerwacji.getIloscOkularow(),DaneDoRezerwacji.getIloscKapokow());
                DaneDoRezerwacji.getTor().setZajety();
                DaneDoRezerwacji.getInstruktor().setZajety();
                Main.zapis();
            }
            Ostatnie.widok().setVisible(true);
        });
        b1.addActionListener(s -> {
            f.setVisible(false);
            WidokPoczatkowy.widok().setVisible(true);
        });


        f.add(jt2);
        f.add(x);
        f.add(b);
        f.add(j1);
        f.add(b3);
        f.add(j2);
        f.add(b4);
        f.add(j3);
        f.add(b6);
        f.add(j4);
        f.add(b5);
        f.add(j5);


        f.add(b2);
        f.add(b1);

        f.setLayout(new GridLayout(7,2, 10, 10));
        f.setBounds(500,500,500,300);
        return f;
    }
    public static void dodajSprzet(Rezerwacja r, int i, int k, int z){
        r.addSprzet(i);
        r.addSprzet(k);
        r.addSprzet(z);
    }

    public static void odejmijZeStanu(int i, int k, int z){
        SprzetPlywacki.rodzaj(1).odejmijZeStanu(i);
        SprzetPlywacki.rodzaj(2).odejmijZeStanu(k);
        SprzetPlywacki.rodzaj(3).odejmijZeStanu(z);
    }

}
