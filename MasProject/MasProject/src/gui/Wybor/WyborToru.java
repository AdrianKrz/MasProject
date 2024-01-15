package gui.Wybor;

import gui.Bledy.TorZajety;
import gui.DaneDoRezerwacji;
import klasy.Osoby.Osoba;
import klasy.Tory.Tor;
import klasy.Tory.TorDlaDzieci;
import klasy.Tory.TorPlywacki;
import klasy.Tory.TorZPrzeszkodami;

import javax.swing.*;
import java.awt.*;

public class WyborToru {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b =new JButton("Tor pływacki");
        b.setBackground(Color.WHITE);
        JButton b2 =new JButton("Tor z przeszkodami");
        b2.setBackground(Color.WHITE);
        JButton b3 =new JButton("Tor dla dzieci");
        b3.setBackground(Color.WHITE);


        JLabel jt2 = new JLabel("Wybierz rodzaj toru:");
        jt2.setForeground(Color.WHITE);
        f.setTitle("Nowa rezerwacja");
        JLabel x = new JLabel();
        JLabel x2 = new JLabel();


        b.addActionListener( s -> {
            boolean czyWolne = false;
            for(int i = 1; i <= Osoba.getExtentSize(); i++){
                if(Tor.rodzaj(i) instanceof TorPlywacki){
                    if(Tor.rodzaj(i).czyWolny()){
                        czyWolne = true;
                        DaneDoRezerwacji.setTor(Tor.rodzaj(i));
                        break;
                    }
                }
            }

            f.setVisible(false);
            if(czyWolne){
                WyborInstruktora.widok().setVisible(true);
            }else {
                TorZajety.widok().setVisible(true);
            }
        });

        b2.addActionListener( s -> {
            boolean czyWolne = false;
            for(int i = 1; i <= Osoba.getExtentSize(); i++){
                if(Tor.rodzaj(i) instanceof TorZPrzeszkodami){
                    if(Tor.rodzaj(i).czyWolny()){
                        czyWolne = true;
                        DaneDoRezerwacji.setTor(Tor.rodzaj(i));
                        break;
                    }
                }
            }

            f.setVisible(false);
            if(czyWolne){
                WyborInstruktora.widok().setVisible(true);
            }else {
                TorZajety.widok().setVisible(true);
            }
        });

        b3.addActionListener( s -> {
            boolean czyWolne = false;
            for(int i = 1; i <= Osoba.getExtentSize(); i++){
                if(Tor.rodzaj(i) instanceof TorDlaDzieci){
                    if(Tor.rodzaj(i).czyWolny()){
                        czyWolne = true;
                        DaneDoRezerwacji.setTor(Tor.rodzaj(i));
                        break;
                    }
                }
            }

            f.setVisible(false);
            if(czyWolne){
                WyborInstruktora.widok().setVisible(true);
            }else {
                TorZajety.widok().setVisible(true);
            }
        });


        f.add(jt2);
        f.add(x);
        f.add(x2);
        f.add(b);
        f.add(b2);
        f.add(b3);

        f.setLayout(new GridLayout(2,3));
        f.setBounds(500,500,500,300);
        return f;
    }
}
