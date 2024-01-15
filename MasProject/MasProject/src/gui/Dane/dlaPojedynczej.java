package gui.Dane;

import gui.DaneDoRezerwacji;
import gui.WidokPoczatkowy;
import gui.Wybor.WyborToru;

import javax.swing.*;
import java.awt.*;

public class dlaPojedynczej {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Nowa rezerwacja");




        JLabel b =new JLabel("Data rezerwacji: ");
        b.setForeground(Color.WHITE);
        JLabel b3 =new JLabel("Numer Opiekuna: ");
        b3.setForeground(Color.WHITE);




        JTextArea j1 = new JTextArea();
        JTextArea j2 = new JTextArea();
        JTextArea j3 = new JTextArea();
        j1.setForeground(Color.WHITE);
        j2.setForeground(Color.WHITE);
        j3.setForeground(Color.WHITE);
        j1.setBackground(Color.BLACK);
        j2.setBackground(Color.BLACK);
        j3.setBackground(Color.BLACK);

        JButton b2 =new JButton("AKCEPTUJ");
        b2.setBackground(Color.WHITE);
        JButton b1 =new JButton("ANULUJ");
        b1.setBackground(Color.WHITE);

        JLabel jt2 = new JLabel("Informacje do rezerwacji pojedynczej: ");
        jt2.setForeground(Color.WHITE);
        JLabel x = new JLabel();
        x.setForeground(Color.WHITE);
        b2.addActionListener( s -> {
            if(DaneDoRezerwacji.getPrywatny().getWiek() < 18){
                if(j1.getText().equals("") || j2.getText().equals("")){
                    x.setText("Brakuje Danych");
                } else {
                    f.setVisible(false);
                    DaneDoRezerwacji.setDataRezerwacji(j1.getText());
                    DaneDoRezerwacji.setPoziomZaawansowania(j2.getText());

                    WyborToru.widok().setVisible(true);
                }
            }else {
                if(j1.getText().equals("")){
                    x.setText("Brakuje Danych");
                } else {
                    f.setVisible(false);
                    DaneDoRezerwacji.setDataRezerwacji(j1.getText());

                    WyborToru.widok().setVisible(true);
                }
            }
        });
        b1.addActionListener( s -> {
            f.setVisible(false);
            WidokPoczatkowy.widok().setVisible(true);
        });

        f.add(jt2);
        f.add(x);
        f.add(b);
        f.add(j1);
        if(DaneDoRezerwacji.getPrywatny().getWiek() < 18){
            f.add(b3);
            f.add(j2);
        }

        f.add(b2);
        f.add(b1);
        f.setLayout(new GridLayout(5,2));
        f.setBounds(500,500,500,300);
        return f;
    }
}
