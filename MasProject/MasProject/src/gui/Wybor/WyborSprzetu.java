package gui.Wybor;

import gui.Bledy.SprzetZajety;
import gui.DaneDoRezerwacji;
import gui.Podsumowanie;
import klasy.Sprzet.SprzetPlywacki;

import javax.swing.*;
import java.awt.*;

public class WyborSprzetu {
    public static JFrame widok() {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Nowa rezerwacja");




        JLabel b =new JLabel("Makaron: ");
        b.setForeground(Color.WHITE);
        JLabel b3 =new JLabel("Okulary pływackie: ");
        b3.setForeground(Color.WHITE);
        JLabel b4 =new JLabel("Kapok dla dzieci: ");
        b4.setForeground(Color.WHITE);

        JLabel b5 =new JLabel("Ilość");
        b5.setForeground(Color.WHITE);

        JTextArea j1 = new JTextArea("0");
        JTextArea j2 = new JTextArea("0");
        JTextArea j3 = new JTextArea("0");
        j1.setForeground(Color.WHITE);
        j2.setForeground(Color.WHITE);
        j3.setForeground(Color.WHITE);
        j1.setBackground(Color.BLACK);
        j2.setBackground(Color.BLACK);
        j3.setBackground(Color.BLACK);

        JButton b2 =new JButton("Ok");
        b2.setBackground(Color.WHITE);

        JLabel jt2 = new JLabel("Wybierz sprzęt dodatkowy:");
        jt2.setForeground(Color.WHITE);

        b2.addActionListener(s -> {
            int makarony = Integer.parseInt(j1.getText());
            int okulary = Integer.parseInt(j2.getText());
            int kapoki = Integer.parseInt(j3.getText());
            f.setVisible(false);
            if(makarony == 0 && okulary == 0 && kapoki == 0){
                Podsumowanie.widok().setVisible(true);
            }else if(
                    (SprzetPlywacki.rodzaj(1).getIloscDoWykorzystania() - makarony) >= 0 &&
                    (SprzetPlywacki.rodzaj(2).getIloscDoWykorzystania() - okulary) >= 0 &&
                    (SprzetPlywacki.rodzaj(3).getIloscDoWykorzystania() - kapoki) >= 0
            ){
                DaneDoRezerwacji.setIloscMakaronow(makarony);
                DaneDoRezerwacji.setIloscOkularow(okulary);
                DaneDoRezerwacji.setIloscKapokow(kapoki);
                Podsumowanie.widok().setVisible(true);
            }else{
                SprzetZajety.widok().setVisible(true);
            }
        });

        f.add(jt2);
        f.add(b5);
        f.add(b);
        f.add(j1);
        f.add(b3);
        f.add(j2);
        f.add(b4);
        f.add(j3);

        f.add(b2);

        f.setLayout(new GridLayout(5,2, 10, 10));
        f.setBounds(500,500,500,300);
        return f;
    }
}
