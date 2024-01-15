package gui.Bledy;

import gui.WidokPoczatkowy;
import gui.Wybor.WyborInstruktora;

import javax.swing.*;
import java.awt.*;

public class InstruktorZajety {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b =new JButton("Zmiana instuktora");
        b.setBackground(Color.WHITE);
        JButton b2 =new JButton("ANULUJ");
        b2.setBackground(Color.WHITE);


        JLabel jt2 = new JLabel("Instruktor jest zajęty brak uprawnień");
        jt2.setForeground(Color.WHITE);
        JLabel jt3 = new JLabel("Wybierz inny lub anuluj rezerwację:");
        jt3.setForeground(Color.WHITE);
        f.setTitle("Nowa rezerwacja");
        JLabel x = new JLabel();
        JLabel x2 = new JLabel();

        b.addActionListener(s -> {
            f.setVisible(false);
            WyborInstruktora.widok().setVisible(true);
        });


        b2.addActionListener(s -> {
            f.setVisible(false);
            WidokPoczatkowy.widok().setVisible(true);
        });

        f.add(jt2);
        f.add(x);
        f.add(jt3);
        f.add(x2);
        f.add(b);
        f.add(b2);

        f.setLayout(new GridLayout(3,2, 10, 10));
        f.setBounds(500,500,500,300);
        return f;
    }
}
