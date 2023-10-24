public class selEntrar extends Tela{
    public selEntrar(){
        super("src//imagens//selEntrar.jpg");

        Button btnSelRes = new Button();
        btnSelRes.setBounds(85,512,280,60);
        Button btnSelUser = new Button();
        btnSelUser.setBounds(85,600,280,60);

        btnSelRes.addActionListener(e -> {
            selRes selRes = new selRes();
            selRes.setVisible(true);
            System.out.println("Olá, estou indo para a próxima pagina");
            dispose();
        });

        btnSelUser.addActionListener(e -> {
            SelUser selUser = new SelUser();
            selUser.setVisible(true);
            System.out.println("Olá, estou indo para a próxima pagina");
            dispose();
        });

        getContentPane().add(btnSelRes);
        getContentPane().add(btnSelUser);
    }

    public static void main(String[] args) {
        new selEntrar();
    }
}