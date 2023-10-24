import Components.Password;

import javax.swing.*;

public class CadUser extends Tela{
    public CadUser(){
        super("src//imagens//cadUser.jpg");
        Input cadNomeUser = new Input();
        Input cadCpf = new Input();
        Input cadEnderecoEntrega = new Input();
        Password cadSenhaUser = new Password();
        // Input cadSenhaUser = new Input();
        Button btnAdicionarUser = new Button();

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



    }

    public static void main(String[] args) {
        new CadUser();
    }
}
