import Components.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntrarRes extends Tela {
    public EntrarRes(){
        super("src//imagens//entrarRes.jpg");

        Button btnEntrarRes = new Button();
        Input cnpjLogin = new Input();
        Password senhaRestauranteLogin = new Password();
        ButtonVoltar btnVoltar = new ButtonVoltar();

        cnpjLogin.setBounds(55,310,350,50);
        senhaRestauranteLogin.setBounds(55,429,342,50);
        btnEntrarRes.setBounds(85,627,280,60);
        btnVoltar.setLocation(24,18);

        getContentPane().add(btnEntrarRes);
        getContentPane().add(cnpjLogin);
        getContentPane().add(senhaRestauranteLogin);
        getContentPane().add(btnVoltar);

        btnEntrarRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cnpjDigitado = cnpjLogin.getText();
                String senhaResDigitada = senhaRestauranteLogin.getText();

                for (Restaurante restaurante :
                     App.restaurantes) {
                    if (restaurante.getCnpj().equals(cnpjDigitado) && restaurante.getSenhaRestaurante().equalsIgnoreCase(senhaResDigitada)) {
                        CadPrato cadPrato = new CadPrato();
                        cadPrato.setVisible(true);
                        System.out.println("Olá, estou indo para adicionar prato");
                        dispose();
                    }
                    else {
                        Start start = new Start();
                        start.setVisible(true);
                        System.out.println("Olá, estou voltando para o começo");
                        dispose();
                    }
                }
                System.out.println(cnpjDigitado + senhaResDigitada);
            }
        });

        btnVoltar.addActionListener(e -> {
            selRes selRes = new selRes();
            selRes.setVisible(true);
            System.out.println("to voltando pra tela anterior");
            dispose();
        });

    }

    public static void main(String[] args) {
        new EntrarRes();
    }
}
