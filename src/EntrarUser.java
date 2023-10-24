import Components.Button;
import Components.Input;
import Components.Password;
import Components.Tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntrarUser extends Tela {
    public EntrarUser(){
        super("src//imagens//entrarUser.jpg");

        Button btnEntrarUser = new Button();
        Input cpfLogin = new Input();
        Password senhaUserLogin = new Password();

        btnEntrarUser.setBounds(85,627,280,60);
        cpfLogin.setBounds(55,310,350,50);
        senhaUserLogin.setBounds(55,429,342,50);

        btnEntrarUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfLogin.getText();
                String senhaUser = senhaUserLogin.getText();

                for (Restaurante restaurante : App.restaurantes) {
                    if (restaurante.getCnpj().equals(cpf) && restaurante.getSenhaRestaurante().equalsIgnoreCase(senhaUser)) {
                        // CRIAR O REALIZAR PEDIDO
                        System.out.println("Olá, PASSEEEEEEEI");
                        dispose();
                    }
                    else {
                        Start start = new Start();
                        start.setVisible(true);
                        System.out.println("Olá, estou voltando para o começo");
                        dispose();
                    }
                }
                System.out.println(cpf + senhaUser);
            }
        });
        getContentPane().add(btnEntrarUser);
        getContentPane().add(cpfLogin);
        getContentPane().add(senhaUserLogin);
    }

    public static void main(String[] args) {
        new EntrarUser();
    }
}
