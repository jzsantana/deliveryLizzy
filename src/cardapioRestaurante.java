import Classes.App;
import Classes.Restaurante;
import Components.Button;
import Components.ButtonVoltar;
import Components.Tela;

import javax.swing.*;
import java.util.ArrayList;

public class cardapioRestaurante extends Tela {
    public cardapioRestaurante(){
        super("src//imagens//escolhaRes.jpg");

        ButtonVoltar btnVoltar = new ButtonVoltar();

        // tras a lista de restaurantes para essa classe
        ArrayList<Restaurante> listaRes = App.restaurantes;
        String [] opcoesRestaurante = new String[listaRes.size()];
        DefaultComboBoxModel<Restaurante> teste = new DefaultComboBoxModel<>(App.restaurantes.toArray(new Restaurante[0]));
        JComboBox<Restaurante> comboBoxRestaurante = new JComboBox<>(teste);
        comboBoxRestaurante.setBounds(50,352,350,40);


        getContentPane().add(comboBoxRestaurante);
    }

    public static void main(String[] args) {
        new cardapioRestaurante();
    }
}
