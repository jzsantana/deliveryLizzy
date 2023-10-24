import Components.Button;
import Components.Tela;

public class SelUser extends Tela {
    public SelUser(){
        super("src//imagens//selUser.jpg");

        Button btnEntrarSelUser = new Button();
        btnEntrarSelUser.setBounds(85,509,280,65);
        Button btnCadUser = new Button();
        btnCadUser.setBounds(85,600,280,65);

        btnEntrarSelUser.addActionListener(e -> {
            EntrarUser entrarUser = new EntrarUser();
            entrarUser.setVisible(true);
            System.out.println("Olá, estou indo para o entrar usuario");
            dispose();
        });

        btnCadUser.addActionListener(e -> {
            CadUser cadUser = new CadUser();
            cadUser.setVisible(true);
            System.out.println("Olá, estou indo para o cad user");
            dispose();
        });

        getContentPane().add(btnEntrarSelUser);
        getContentPane().add(btnCadUser);
    }

    public static void main(String[] args) {
        new SelUser();
    }

}
