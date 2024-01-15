package gui.Bledy;

import gui.WidokPoczatkowy;
import gui.Wybor.WyborSprzetu;

import javax.swing.*;
import java.awt.*;

public class SprzetZajety {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b =new JButton("Zmiana sprzętu");
        b.setBackground(Color.WHITE);
        JButton b2 =new JButton("ANULUJ");
        b2.setBackground(Color.WHITE);


        JLabel jt2 = new JLabel("Sprzęt nie jest dostępny");
        jt2.setForeground(Color.WHITE);
        JLabel x = new JLabel("Wybierz inny lub anuluj rezerwację");
        x.setForeground(Color.WHITE);
        f.setTitle("Nowa rezerwacja");

        b.addActionListener(s -> {
            f.setVisible(false);
            WyborSprzetu.widok().setVisible(true);
        });

        b2.addActionListener(s -> {
            f.setVisible(false);
            WidokPoczatkowy.widok().setVisible(true);
        });

        f.add(jt2);
        f.add(x);
        f.add(b);
        f.add(b2);

        f.setLayout(new GridLayout(2,2, 10, 10));
        f.setBounds(500,500,500,300);
        return f;
    }
}
