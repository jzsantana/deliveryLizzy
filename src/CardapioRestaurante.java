import Classes.App;
import Classes.Restaurante;
import Components.ButtonVoltar;
import Components.Tela;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CardapioRestaurante extends Tela {
    public CardapioRestaurante(){
        super("src//imagens//escolhaRes.jpg");

        ButtonVoltar btnVoltar = new ButtonVoltar();

        btnVoltar.setLocation(24,18);

        // tras a lista de restaurantes para essa classe
        ArrayList<Restaurante> listaRes = App.restaurantes;
        String [] opcoesRestaurante = new String[listaRes.size()];
        DefaultComboBoxModel<Restaurante> teste = new DefaultComboBoxModel<>(App.restaurantes.toArray(new Restaurante[0]));
        JComboBox<Restaurante> comboBoxRestaurante = new JComboBox<>(teste);
        comboBoxRestaurante.setBounds(50,360,350,35);
        comboBoxRestaurante.setBackground(Color.WHITE);
        comboBoxRestaurante.setForeground(Color.BLACK);
        comboBoxRestaurante.setFont(new Font("Arial", Font.BOLD, 15));

        btnVoltar.addActionListener(e -> {
            SelUser selUser = new SelUser();
            selUser.setVisible(true);
            dispose();
        });

        getContentPane().add(comboBoxRestaurante);
        getContentPane().add(btnVoltar);
    }

    public static void main(String[] args) {
        new CardapioRestaurante();
    }
}
