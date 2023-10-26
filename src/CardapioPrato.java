import Classes.Prato;
import Components.ButtonVoltar;
import Components.Tela;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CardapioPrato extends Tela {
    public CardapioPrato(){
        super("src//imagens//escolhaPrato.jpg");

        ButtonVoltar btnVoltar = new ButtonVoltar();

        ArrayList<Prato> listaPratos = Prato.pratos;
        String [] opcoesPratos = new String[listaPratos.size()];
        DefaultComboBoxModel<Prato> teste = new DefaultComboBoxModel<>(Prato.pratos.toArray(new Prato[0]));
        JComboBox<Prato> comboBoxPrato = new JComboBox<>(teste);

        comboBoxPrato.setBounds(50,360,350,35);
        comboBoxPrato.setBackground(Color.WHITE);
        comboBoxPrato.setForeground(Color.BLACK);
        comboBoxPrato.setFont(new Font("Arial", Font.BOLD, 15));
        btnVoltar.setLocation(24,18);

        getContentPane().add(btnVoltar);
        getContentPane().add(comboBoxPrato);

        btnVoltar.addActionListener(e -> {
            CardapioPrato cardPrato = new CardapioPrato();
            cardPrato.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) {
        new CardapioPrato();
    }
}
