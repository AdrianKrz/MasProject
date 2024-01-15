package gui;

import gui.Dane.dlaGrupowej;
import gui.Dane.dlaPojedynczej;
import gui.Dane.dlaRodzinnej;

import javax.swing.*;
import java.awt.*;

public class RezerwacjaPrywatna {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b =new JButton("Rodzinna");
        b.setBackground(Color.WHITE);
        JButton b2 =new JButton("Grupowa");
        b2.setBackground(Color.WHITE);
        JButton b3 =new JButton("Pojedyńcza");
        b3.setBackground(Color.WHITE);

        JLabel x = new JLabel();
        JLabel x2 = new JLabel();
        JLabel jt2 = new JLabel("Wybierz rodzaj rezerwacji:");
        jt2.setForeground(Color.WHITE);
        f.setTitle("Nowa rezerwacja");


        b.addActionListener( s -> {
            f.setVisible(false);
            DaneDoRezerwacji.setRodzajRezerwacji("Rodzinna");
            dlaRodzinnej.widok().setVisible(true);
        });

        b2.addActionListener( s -> {
            f.setVisible(false);
            DaneDoRezerwacji.setRodzajRezerwacji("Grupowa");
            dlaGrupowej.widok().setVisible(true);
        });

        b3.addActionListener( s -> {
            f.setVisible(false);
            DaneDoRezerwacji.setRodzajRezerwacji("Pojedyncza");
            dlaPojedynczej.widok().setVisible(true);
        });

        f.add(jt2);
        f.add(x);
        f.add(x2);
        f.add(b);
        f.add(b2);
        f.add(b3);
        f.setBounds(500,500,500,300);
        f.setLayout(new GridLayout(2,2, 10, 10));
        return f;
    }
}
