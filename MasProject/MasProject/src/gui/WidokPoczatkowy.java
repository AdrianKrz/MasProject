package gui;

import gui.Wybor.WyborKlientaPrezes;
import gui.Wybor.WyborKlientaPrywatnego;
import klasy.Rezerwacje.Grupowa;
import klasy.Rezerwacje.Rezerwacja;
import klasy.Rezerwacje.Rodzinna;

import javax.swing.*;
import java.awt.*;

public class WidokPoczatkowy {
        public static JFrame widok() {
                JFrame f = new JFrame();
                f.getContentPane().setBackground(Color.BLACK);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JButton b = new JButton("Prywatny");
                b.setBackground(Color.WHITE);
                JButton b2 = new JButton("Prezes Klubu");
                b2.setBackground(Color.WHITE);
                JComboBox<String> rezerwacje = new JComboBox<>();
                for(int i = 1; i <= Rezerwacja.getExtentSize(); i++){
                        rezerwacje.addItem(Rezerwacja.rodzaj(i).toString());
                }

                JLabel jt = new JLabel("Witaj Dyrektorze");
                jt.setForeground(Color.WHITE);
                JLabel jt2 = new JLabel("Wybierz klienta:");
                jt2.setForeground(Color.WHITE);
                JLabel jt3 = new JLabel("Aktualne rezerwacje:");
                jt3.setForeground(Color.WHITE);
                f.setTitle("Nowa rezerwacja");


                f.add(jt);
                f.add(jt2);
                f.add(b);
                f.add(b2);
                f.add(jt3);
                f.add(rezerwacje);
                f.setLayout(new GridLayout(3,2, 50, 50));


                b.addActionListener( s -> {
                        DaneDoRezerwacji.setRodzajKlienta("Prywatny");
                        WyborKlientaPrywatnego.widok().setVisible(true);
                        f.setVisible(false);
                });


                b2.addActionListener( s -> {
                        DaneDoRezerwacji.setRodzajKlienta("Prezes");
                        WyborKlientaPrezes.widok().setVisible(true);
                        f.setVisible(false);
                });




                f.setBounds(500,500,500,300);
                return f;
        }
}