package gui;

import javax.swing.*;
import java.awt.*;

public class Ostatnie {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b =new JButton("koniec");
        b.setBackground(Color.WHITE);


        JLabel jt2 = new JLabel("Rezerwacja została dodana");
        jt2.setForeground(Color.WHITE);

        f.setTitle("Nowa rezerwacja");

        b.addActionListener(s -> {
            f.setVisible(false);
            WidokPoczatkowy.widok().setVisible(true);
        });

        f.add(jt2);
        f.add(b);

        f.setLayout(new GridLayout(2,1, 10, 10));
        f.setBounds(500,500,500,300);
        return f;
    }
}
