package gui.Dane;

import gui.DaneDoRezerwacji;
import gui.WidokPoczatkowy;
import gui.Wybor.WyborToru;

import javax.swing.*;
import java.awt.*;

public class dlaRodzinnej {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Nowa rezerwacja");




        JLabel b =new JLabel("Data rezerwacji: ");
        b.setForeground(Color.WHITE);
        JLabel b3 =new JLabel("Ilość dzieci niepełnoletnich: ");
        b3.setForeground(Color.WHITE);
        JLabel b4 =new JLabel("zniżnka: ");
        b4.setForeground(Color.WHITE);

        JLabel b6 =new JLabel("Ilość osób: ");
        b6.setForeground(Color.WHITE);
        JLabel b7 =new JLabel("Czy rodzic umie plywac: ");
        b7.setForeground(Color.WHITE);



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

        JLabel jt2 = new JLabel("Informacje do rezerwacji rodzinnej: ");
        jt2.setForeground(Color.WHITE);
        JLabel x =new JLabel();
        x.setForeground(Color.WHITE);

        b2.addActionListener( s -> {
            if(j1.getText().equals("") || j2.getText().equals("") || j3.getText().equals("") || j4.getText().equals("") || j5.getText().equals("")){
                x.setText("Brakuje Danych");
            } else {
                f.setVisible(false);
                DaneDoRezerwacji.setDataRezerwacji(j1.getText());
                DaneDoRezerwacji.setIloscDzieciNiepelnoletnich(Integer.parseInt(j2.getText()));
                DaneDoRezerwacji.setZnizka(Double.parseDouble(j3.getText()));
                DaneDoRezerwacji.setIloscOsobWRodzinnej(Integer.parseInt(j4.getText()));
                DaneDoRezerwacji.setCzyRodzinUmiePlywac(Boolean.parseBoolean(j5.getText()));
                WyborToru.widok().setVisible(true);
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

        f.add(b3);
        f.add(j2);

        f.add(b4);
        f.add(j3);
        f.add(b6);

        f.add(j4);
        f.add(b7);

        f.add(j5);


        f.add(b2);
        f.add(b1);

        f.setLayout(new GridLayout(7,2));
        f.setBounds(500,500,500,300);
        return f;
    }

}
