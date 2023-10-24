import Components.Button;
import Components.Tela;

public class Start extends Tela {
    public Start(){
        super("src//imagens//Start.jpg");

        Button start = new Button();
        start.setBounds(85,585,280,65);

        start.addActionListener(e -> {
            selEntrar selEntrar = new selEntrar();
            selEntrar.setVisible(true);
            System.out.println("Olá, estou indo para a próxima pagina");
            dispose();
        });

        getContentPane().add(start);
    }

    public static void main(String[] args) {
        new Start();
    }
}
