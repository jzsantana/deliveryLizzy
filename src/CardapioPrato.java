import Classes.Prato;
import Classes.Restaurante;
import Components.ButtonVoltar;
import Components.Tela;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import static Classes.Prato.pratos;

public class CardapioPrato extends Tela {
    public CardapioPrato(){
        super("src//imagens//escolhaPrato.jpg");

        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        ButtonVoltar btnVoltar = new ButtonVoltar();

        //adicionando colunas na tabela que retronará os pratos cadstrados
        model.addColumn("Nome do prato");
        model.addColumn("Preço");

        ArrayList<Prato> listaDePratos = pratos;

        for (Prato prato : listaDePratos){
            model.addRow(new Object[]{prato.toString()});
        }

        table.setModel(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50,207,350,415);

        // crio o combobox a partir da lista em que cadastrei os pratos
        //ArrayList<Prato> listaPratos = Prato.pratos;
        //String [] opcoesPratos = new String[listaPratos.size()];
        //DefaultComboBoxModel<Prato> teste = new DefaultComboBoxModel<>(Prato.pratos.toArray(new Prato[0]));
        //JComboBox<Prato> comboBoxPrato = new JComboBox<>(teste);

        //comboBoxPrato.setBounds(50,360,350,35);
        //comboBoxPrato.setBackground(Color.WHITE);
        //comboBoxPrato.setForeground(Color.BLACK);
        //comboBoxPrato.setFont(new Font("Arial", Font.BOLD, 15));
        //btnVoltar.setLocation(24,18);

        getContentPane().add(btnVoltar);
        getContentPane().add(scrollPane);
//        getContentPane().add(comboBoxPrato);

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
