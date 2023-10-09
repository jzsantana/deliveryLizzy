
public class selRes extends Tela{
    public selRes(){
        super("src//imagens//selRes.jpg");

        Button btnEntrarSelRes = new Button();
        btnEntrarSelRes.setBounds(85,509,280,65);
        Button btnCadRes = new Button();
        btnCadRes.setBounds(85,600,280,65);

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

        getContentPane().add(btnEntrarSelRes);
        getContentPane().add(btnCadRes);
    }

    public static void main(String[] args) {
        new selRes();
    }
}
