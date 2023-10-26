import Components.ButtonVoltar;
import Components.Tela;

public class CardapioPrato extends Tela {
    public CardapioPrato(){
        super("src//imagens//escolhaPrato.jpg");

        ButtonVoltar btnVoltar = new ButtonVoltar();
        btnVoltar.setLocation(24,18);
        getContentPane().add(btnVoltar);

        btnVoltar.addActionListener(e -> {
            SelUser selUser = new SelUser();
            selUser.setVisible(true);
            dispose();
        });
    }

    public static void main(String[] args) {
        new CardapioPrato();
    }
}
