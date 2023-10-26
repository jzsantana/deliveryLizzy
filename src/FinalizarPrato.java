import Components.Button;
import Components.Tela;

public class FinalizarPrato extends Tela {
    public FinalizarPrato(){
        super("src//imagens//finalizarPrato.jpg");

        Button btnAdicionarOutro = new Button();
        Button btnFinalizar = new Button();

        btnAdicionarOutro.setBounds(50, 294,350,65);
        btnFinalizar.setBounds(50, 398,350,65);

        getContentPane().add(btnAdicionarOutro);
        getContentPane().add(btnFinalizar);

        btnAdicionarOutro.addActionListener(e ->{
            CadPrato cadPrato = new CadPrato();
            cadPrato.setVisible(true);
            dispose();
        });

        btnFinalizar.addActionListener(e -> {
            selEntrar selEntrar = new selEntrar();
            selEntrar.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) { new FinalizarPrato(); }
}
