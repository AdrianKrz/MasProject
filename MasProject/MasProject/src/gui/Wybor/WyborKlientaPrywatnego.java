package gui.Wybor;


import gui.DaneDoRezerwacji;
import gui.RezerwacjaKlub;
import gui.RezerwacjaPrywatna;
import klasy.Osoby.Osoba;
import klasy.Osoby.PrezesKlubuSportowego;
import klasy.Osoby.Prywatny;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class WyborKlientaPrywatnego {

    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Nowa rezerwacja");

        JLabel l1 = new JLabel("Klienci: ");

        l1.setForeground(Color.WHITE);
        JButton b2 =new JButton("Ok");
        b2.setBackground(Color.WHITE);

        JLabel jt2 = new JLabel("Wybierz Klienta:");
        jt2.setForeground(Color.WHITE);

        JLabel x = new JLabel();
        JLabel x2 = new JLabel();

        JComboBox<Prywatny> comboBox = new JComboBox<>();


        for(int i = 1; i <= Osoba.getExtentSize(); i++){
            if(Osoba.rodzaj(i) instanceof Prywatny)
                comboBox.addItem((Prywatny)Osoba.rodzaj(i));
        }





        b2.addActionListener( s -> {
            String id = Objects.requireNonNull(comboBox.getSelectedItem()).toString();
            int ids = Integer.parseInt(id.split(" ")[3]);
            DaneDoRezerwacji.setPrywatny((Prywatny) Osoba.rodzaj(ids));
            f.setVisible(false);

            RezerwacjaPrywatna.widok().setVisible(true);

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
