import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntrarRes extends Tela {
    public EntrarRes(){
        super("src//imagens//entrarRes.jpg");

        Button btnEntrarRes = new Button();
        btnEntrarRes.setBounds(85,627,280,60);

        Input cnpjLogin = new Input();
        Input senhaRestauranteLogin = new Input();

        cnpjLogin.setBounds(55,310,350,50);
        senhaRestauranteLogin.setBounds(55,429,342,50);

        btnEntrarRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cnpjDigitado = cnpjLogin.getText();
                String senhaResDigitada = senhaRestauranteLogin.getText();
                System.out.println(cnpjDigitado + senhaResDigitada);
            }
        });

        btnEntrarRes.addActionListener(e -> {
            selRes selRes = new selRes();
            selRes.setVisible(true);
            System.out.println("Olá, estou indo para a próxima pagina");
            dispose();
        });

        getContentPane().add(btnEntrarRes);
        getContentPane().add(cnpjLogin);
        getContentPane().add(senhaRestauranteLogin);

    }

    public static void main(String[] args) {
        new EntrarRes();
    }

}