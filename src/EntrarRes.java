import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EntrarRes extends Tela {


    public EntrarRes(){
        super("src//imagens//entrarRes.jpg");

        Button btnEntrarRes = new Button();
        btnEntrarRes.setBounds(85,627,280,60);
//        cadRes.restaurantes.set(i, restaurante);
        Input cnpjLogin = new Input();
        Input senhaRestauranteLogin = new Input();

        cnpjLogin.setBounds(55,310,350,50);
        senhaRestauranteLogin.setBounds(55,429,342,50);

        btnEntrarRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cnpjDigitado = cnpjLogin.getText();
                String senhaResDigitada = senhaRestauranteLogin.getText();

                Restaurante restaurante = new Restaurante();

//                ArrayList<Restaurante> array = App.restaurantes();

                for (Restaurante restaurante1 :
                     App.restaurantes) {
                    if (restaurante1.getCnpj().equals(cnpjDigitado)) { // Substitua 'getNome()' pelo método apropriado para obter o nome do restaurante
                        System.out.println("Restaurante encontrado: " + restaurante1);
                    }
                }
                
                

//                if (App.restaurantes.get(0).equals(cnpjDigitado) && App.restaurantes.get(0).equals(senhaResDigitada)){
//                    System.out.println(App.restaurantes + cnpjDigitado + senhaResDigitada);
//
//                    CadPrato cadPrato = new CadPrato();
//                    cadPrato.setVisible(true);
//                    System.out.println("Olá, estou indo para a próxima pagina");
//                    dispose();
//
//                }
                
                System.out.println(cnpjDigitado + senhaResDigitada);
            }
        });

        btnEntrarRes.addActionListener(e -> {
            selRes selRes = new selRes();
            selRes.setVisible(true);
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
