import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class cadRes extends Tela{
    public cadRes() {
        super("src//imagens//telaCadRes.jpg");
        Input inputNomeRes = new Input();
        Input cnpj = new Input();
        Input posMapaRes = new Input();
        Input senhaRestaurante = new Input();
        Button btnAdicionarRes = new Button();

        inputNomeRes.setBounds(54,188,342,50);
        cnpj.setBounds(54,292,342,50);
        posMapaRes.setBounds(54,396,342,50);
        senhaRestaurante.setBounds(54,499,342,50);
        btnAdicionarRes.setBounds(85,631,280,50);

        getContentPane().add(inputNomeRes);
        getContentPane().add(cnpj);
        getContentPane().add(posMapaRes);
        getContentPane().add(senhaRestaurante);
        getContentPane().add(btnAdicionarRes);

//        btnAdicionarRes.addActionListener(e -> {});

        btnAdicionarRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Restaurante restaurante = new Restaurante();

                String novoNomeRes = inputNomeRes.getText();
                String novoCnpj = cnpj.getText();
                String novaPosRes = posMapaRes.getText();
                String novaSenhaRes = senhaRestaurante.getText();

                restaurante.setNomeRestaurante(novoNomeRes);
                restaurante.setPosicaoMapa(novaPosRes);
                restaurante.setSenhaRestaurante(novaSenhaRes);
                restaurante.setCnpj(novoCnpj);

                System.out.println("Nome do restaurante" + restaurante.getNomeRestaurante());

            }
        });

    }

    public static void main(String[] args) {
        new cadRes();
    }
}
