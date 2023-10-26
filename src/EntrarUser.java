import Classes.App;
import Classes.Usuario;
import Components.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntrarUser extends Tela {
    public EntrarUser(){
        super("src//imagens//entrarUser.jpg");

        Button btnEntrarUser = new Button();
        Input cpfLogin = new Input();
        Password senhaUserLogin = new Password();
        ButtonVoltar btnVoltar = new ButtonVoltar();

        btnEntrarUser.setBounds(85,627,280,60);
        cpfLogin.setBounds(55,310,350,50);
        senhaUserLogin.setBounds(55,429,342,50);
        btnVoltar.setLocation(24,18);

        getContentPane().add(btnEntrarUser);
        getContentPane().add(cpfLogin);
        getContentPane().add(senhaUserLogin);
        getContentPane().add(btnVoltar);

        btnEntrarUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfLogin.getText();
                String senhaUser = senhaUserLogin.getText();

                for (Usuario user : App.usuarios) {
                    if (user.getCpf().equals(cpf) && user.getSenhaUsuario().equalsIgnoreCase(senhaUser)) {
                        CardapioRestaurante cardRes = new CardapioRestaurante();
                        cardRes.setVisible(true);
                        dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                    }
                }
                System.out.println(cpf + senhaUser);
            }
        });

        btnVoltar.addActionListener(e -> {
            SelUser selUser = new SelUser();
            selUser.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) { new EntrarUser(); }
}
