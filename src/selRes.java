import Components.Button;
import Components.ButtonVoltar;
import Components.Tela;

public class selRes extends Tela {
    public selRes(){
        super("src//imagens//selRes.jpg");
        // nessa tela o restaurante pode escolher entre cadastrar um novo
        // restaurante ou se já cadastrou entrar na conta

        Button btnEntrarSelRes = new Button();
        Button btnCadRes = new Button();
        ButtonVoltar btnVoltar = new ButtonVoltar();

        btnCadRes.setBounds(85,600,280,65);
        btnEntrarSelRes.setBounds(85,509,280,65);
        btnVoltar.setLocation(45,388);

        getContentPane().add(btnEntrarSelRes);
        getContentPane().add(btnCadRes);
        getContentPane().add(btnVoltar);

        btnEntrarSelRes.addActionListener(e -> {
            EntrarRes entrarRes = new EntrarRes();
            entrarRes.setVisible(true);
            System.out.println("Olá, estou indo para a próxima pagina");
            dispose();
        });

        btnCadRes.addActionListener(e -> {
            cadRes cadRes = new cadRes();
            cadRes.setVisible(true);
            System.out.println("Olá, estou indo para o cad Restaurante");
            dispose();
        });

        btnVoltar.addActionListener(e -> {
            selEntrar selEntrar = new selEntrar();
            selEntrar.setVisible(true);
            System.out.println("to voltando pra tela anterior");
            dispose();
        });
    }

    public static void main(String[] args) { new selRes(); }
}
