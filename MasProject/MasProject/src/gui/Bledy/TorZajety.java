package gui.Bledy;

import gui.WidokPoczatkowy;
import gui.Wybor.WyborInstruktora;
import gui.Wybor.WyborToru;

import javax.swing.*;
import java.awt.*;

public class TorZajety {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b =new JButton("Zmiana toru");
        b.setBackground(Color.WHITE);
        JButton b2 =new JButton("ANULUJ");
        b2.setBackground(Color.WHITE);


        JLabel jt2 = new JLabel("TOR ZAJETY");
        jt2.setForeground(Color.WHITE);
        f.setTitle("Nowa rezerwacja");
        JLabel x = new JLabel("Zmien lub anuluj rezerwację:");
        x.setForeground(Color.WHITE);


        b.addActionListener( s -> {
            f.setVisible(false);
            WyborToru.widok().setVisible(true);
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
