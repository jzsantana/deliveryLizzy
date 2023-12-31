import Classes.App;
import Classes.Restaurante;
import Components.*;
import javax.swing.*;

public class cadRes extends Tela {
    public cadRes() {
        super("src//imagens//telaCadRes.jpg");
        Input inputNomeRes = new Input();
        Input cnpj = new Input();
        Input posMapaRes = new Input();
        Password senhaRestaurante = new Password();
        Button btnAdicionarRes = new Button();

        ButtonVoltar btnVoltar = new ButtonVoltar();
        btnVoltar.setLocation(24,18);
        getContentPane().add(btnVoltar);

        inputNomeRes.setBounds(54,188,342,50);
        cnpj.setBounds(54,292,342,50);
        posMapaRes.setBounds(54,396,342,50);
        senhaRestaurante.setBounds(54,499,342,50);
        btnAdicionarRes.setBounds(85,631,280,50);

        // adiciono os componentes na tela
        getContentPane().add(inputNomeRes);
        getContentPane().add(cnpj);
        getContentPane().add(posMapaRes);
        getContentPane().add(senhaRestaurante);
        getContentPane().add(btnAdicionarRes);

        btnAdicionarRes.addActionListener(e -> {
            String novoNomeRes = inputNomeRes.getText();
            String novoCnpj = cnpj.getText();
            String novaPosRes = posMapaRes.getText();
            String novaSenhaRes = senhaRestaurante.getText();

            // aqui eu estou passando o nome das variaveis que declarei nessa classe
            // que fazem 'referencia' aos atributos declarados no construtor da classe restaurante
            Restaurante restaurante = new Restaurante(novoNomeRes, novoCnpj, novaPosRes, novaSenhaRes);
            App.cadastrarRestaurante(restaurante);

            JOptionPane.showMessageDialog(null, "Restaurante cadastrado com sucesso!");
            CadPrato cadPrato = new CadPrato();
            cadPrato.setVisible(true);
            dispose();
        });

        btnVoltar.addActionListener(e -> {
            selRes selRes = new selRes();
            selRes.setVisible(true);
            dispose();
        });
    }
    public static void main(String[] args) { new cadRes(); }
}