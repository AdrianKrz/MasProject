package gui.Wybor;

import gui.Bledy.InstruktorZajety;
import gui.Bledy.TorZajety;
import gui.DaneDoRezerwacji;
import klasy.Osoby.Instruktor;
import klasy.Osoby.Osoba;
import klasy.Osoby.Prywatny;
import klasy.Tory.TorDlaDzieci;
import klasy.Tory.TorPlywacki;
import klasy.Tory.TorZPrzeszkodami;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class WyborInstruktora {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Nowa rezerwacja");



        JComboBox<Instruktor> comboBox = new JComboBox<>();


        for(int i = 1; i <= Osoba.getExtentSize(); i++){

            if(Osoba.rodzaj(i) instanceof Instruktor){
                comboBox.addItem((Instruktor)Osoba.rodzaj(i));
            }
        }


        JLabel l1 = new JLabel("Instruktorzy: ");

        l1.setForeground(Color.WHITE);
        JButton b2 =new JButton("Ok");
        b2.setBackground(Color.WHITE);

        JLabel jt2 = new JLabel("Wybierz Instruktora:");
        jt2.setForeground(Color.WHITE);
        JLabel x = new JLabel();
        JLabel x2 = new JLabel();



        b2.addActionListener( s -> {
            String id = Objects.requireNonNull(comboBox.getSelectedItem()).toString();
            int ids = Integer.parseInt(id.split(" ")[5]);
            f.setVisible(false);

            if(DaneDoRezerwacji.getTor() instanceof TorPlywacki){
                Instruktor j = (Instruktor)Osoba.rodzaj(ids);

                if(j.CzyWolny() && j.specjalizacja().equals("TorPlywacki")){
                    DaneDoRezerwacji.setInstruktor((Instruktor) Osoba.rodzaj(ids));
                    WyborSprzetu.widok().setVisible(true);
                }else{
                    InstruktorZajety.widok().setVisible(true);
                }
            }

            if(DaneDoRezerwacji.getTor() instanceof TorZPrzeszkodami){
                Instruktor j = (Instruktor)Osoba.rodzaj(ids);

                if(j.CzyWolny() && j.specjalizacja().equals("TorZPrzeszkodami")){
                    DaneDoRezerwacji.setInstruktor((Instruktor) Osoba.rodzaj(ids));
                    WyborSprzetu.widok().setVisible(true);
                }else{
                    InstruktorZajety.widok().setVisible(true);
                }
            }

            if(DaneDoRezerwacji.getTor() instanceof TorDlaDzieci){
                Instruktor j = (Instruktor)Osoba.rodzaj(ids);

                if(j.CzyWolny() && j.specjalizacja().equals("TorDlaDzieci")){
                    DaneDoRezerwacji.setInstruktor((Instruktor) Osoba.rodzaj(ids));
                    WyborSprzetu.widok().setVisible(true);
                } else{
                    InstruktorZajety.widok().setVisible(true);
                }
            }
        });

        f.add(jt2);
        f.add(x);
        f.add(l1);
        f.add(comboBox);
        f.add(b2);
        f.add(x2);

        f.setLayout(new GridLayout(3,2, 10, 10));
        f.setBounds(500,500,500,300);
        return f;
    }
}
