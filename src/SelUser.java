public class SelUser extends Tela{

    public SelUser(){
        super("src//imagens//selUser.jpg");

        Button btnEntrarSelUser = new Button();
        btnEntrarSelUser.setBounds(85,509,280,65);
        Button btnCadUser = new Button();
        btnCadUser.setBounds(85,600,280,65);

        btnEntrarSelUser.addActionListener(e -> {
            EntrarRes entrarRes = new EntrarRes();
            entrarRes.setVisible(true);
            System.out.println("Olá, estou indo para o entrar usuario");
            dispose();
        });

        btnCadUser.addActionListener(e -> {
            cadRes cadRes = new cadRes();
            cadRes.setVisible(true);
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
