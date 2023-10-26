import Classes.App;
import Classes.Usuario;
import Components.*;
import javax.swing.*;

public class CadUser extends Tela {
    public CadUser(){
        super("src//imagens//cadUser.jpg");
        Input cadNomeUser = new Input();
        Input cadCpf = new Input();
        Input cadEnderecoEntrega = new Input();
        Password cadSenhaUser = new Password(); // cria um input com a mascara de senha
        Button btnAdicionarUser = new Button();
        ButtonVoltar btnVoltar = new ButtonVoltar();

        cadNomeUser.setBounds(54,188,342,50);
        cadCpf.setBounds(54,292,342,50);
        cadEnderecoEntrega.setBounds(54,396,342,50);
        cadSenhaUser.setBounds(54,499,342,50);
        btnAdicionarUser.setBounds(85,631,280,50);

        getContentPane().add(cadNomeUser);
        getContentPane().add(cadCpf);
        getContentPane().add(cadEnderecoEntrega);
        getContentPane().add(cadSenhaUser);
        getContentPane().add(btnAdicionarUser);
        getContentPane().add(btnVoltar);

        btnAdicionarUser.addActionListener(e -> {
            String nomeNovoUser = cadNomeUser.getText();
            String cpfNovoUser = cadCpf.getText();
            String enderecoNovoUser = cadEnderecoEntrega.getText();
            String senhaNovoUser = cadSenhaUser.getText();

            Usuario usuario = new Usuario(nomeNovoUser,cpfNovoUser, enderecoNovoUser,senhaNovoUser);
            App.cadastrarUsuario(usuario);

            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");

            selEntrar selEntrar = new selEntrar();
            selEntrar.setVisible(true);
            dispose();
        });

        btnVoltar.addActionListener(e -> {
            SelUser selUser = new SelUser();
            selUser.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) { new CadUser(); }
}
