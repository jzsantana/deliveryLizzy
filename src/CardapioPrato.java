import Classes.Prato;
import Classes.Restaurante;
import Classes.Usuario;
import Components.Button;
import Components.ButtonVoltar;
import Components.Tela;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

import static Classes.Prato.cadastrarPrato;
import static Classes.Prato.pratos;

public class CardapioPrato extends Tela {
    public CardapioPrato(){
        super("src//imagens//escolhaPrato.jpg");

        JTable table = new JTable();
        DefaultTableModel tabelaModelo = new DefaultTableModel();
        ButtonVoltar btnVoltar = new ButtonVoltar();
        Button btnAdicionarPedidoCliente = new Button();

        // adicionando colunas na tabela que retronará os pratos cadstrados
        //tabelaModelo.addColumn("Nome do prato");
        //tabelaModelo.addColumn("Preço");
        //ArrayList<Prato> listaDePratos = pratos;
        //for (Prato prato : listaDePratos){
        //    tabelaModelo.addRow(new Object[]{prato.getNomePrato(), prato.getPrecoPrato()});
        //}

        ArrayList<Prato> listaPrato = pratos;
        String [] opcoesPratos = new String[listaPrato.size()];
        DefaultComboBoxModel<Prato> pr = new DefaultComboBoxModel<>(pratos.toArray(new Prato[0]));
        JComboBox<Prato> comboBoxPratos = new JComboBox<>(pr);

        comboBoxPratos.setBounds(50,360,350,35);
        comboBoxPratos.setBackground(Color.WHITE);
        comboBoxPratos.setForeground(Color.BLACK);
        comboBoxPratos.setFont(new Font("Arial", Font.BOLD, 15));

        table.setModel(tabelaModelo);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(35,207,380,415);
        btnVoltar.setLocation(24,18);

        getContentPane().add(btnVoltar);
        getContentPane().add(scrollPane);

        btnVoltar.addActionListener(e -> {
            selEntrar cardPrato = new selEntrar();
            cardPrato.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) { new CardapioPrato(); }
}
