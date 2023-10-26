import Components.Button;
import Components.Tela;

public class selEntrar extends Tela {
    public selEntrar(){
        super("src//imagens//selEntrar.jpg");
        // nessa tela a pessoa que esta usando o delivery pode selecionar se quer entrar
        // como restaurante ou como usuario

        Button btnSelRes = new Button();
        Button btnSelUser = new Button();

        btnSelUser.setBounds(85,600,280,60);
        btnSelRes.setBounds(85,512,280,60);

        getContentPane().add(btnSelRes);
        getContentPane().add(btnSelUser);

        btnSelRes.addActionListener(e -> {
            selRes selRes = new selRes();
            selRes.setVisible(true);
            dispose();
        });

        btnSelUser.addActionListener(e -> {
            SelUser selUser = new SelUser();
            selUser.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) { new selEntrar();}
}