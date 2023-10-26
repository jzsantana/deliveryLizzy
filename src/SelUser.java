import Components.Button;
import Components.ButtonVoltar;
import Components.Tela;

public class SelUser extends Tela {
    public SelUser(){
        super("src//imagens//selUser.jpg");
        // nessa tela o usuario pode escolher entre cadastrar um novo
        // usuario ou se já cadastrou entrar na conta

        Button btnEntrarSelUser = new Button();
        Button btnCadUser = new Button();
        ButtonVoltar btnVoltar = new ButtonVoltar();

        btnCadUser.setBounds(85,600,280,65);
        btnEntrarSelUser.setBounds(85,509,280,65);
        btnVoltar.setLocation(45,388);

        getContentPane().add(btnEntrarSelUser);
        getContentPane().add(btnCadUser);
        getContentPane().add(btnVoltar);

        btnEntrarSelUser.addActionListener(e -> {
            EntrarUser entrarUser = new EntrarUser();
            entrarUser.setVisible(true);
            //System.out.println("Olá, estou indo para o entrar usuario");
            dispose();
        });

        btnCadUser.addActionListener(e -> {
            CadUser cadUser = new CadUser();
            cadUser.setVisible(true);
            //System.out.println("Olá, estou indo para o cad user");
            dispose();
        });

        btnVoltar.addActionListener(e -> {
            selEntrar selEntrar = new selEntrar();
            selEntrar.setVisible(true);
            System.out.println("to voltando pra tela anterior");
            dispose();
        });
    }

    public static void main(String[] args) { new SelUser(); }
}
