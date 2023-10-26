import Components.Button;
import Components.Tela;

public class Start extends Tela {
    public Start(){
        super("src//imagens//Start.jpg");

        Button start = new Button();
        start.setBounds(85,585,280,65);
        getContentPane().add(start);

        start.addActionListener(e -> {
            selEntrar selEntrar = new selEntrar();
            selEntrar.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) { new Start(); }
}
