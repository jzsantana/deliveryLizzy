import Classes.Prato;
import Components.Button;
import Components.Input;
import Components.Tela;

public class CadPrato extends Tela {
    public CadPrato(){
        super("src//imagens//cadPrato.jpg");

        Input inputNomeNovoPrato = new Input();
        Input inputPrecoNovoPrato = new Input();
        Button adicionarNovoPrato = new Button();

        inputNomeNovoPrato.setBounds(54,212,342,50);
        inputPrecoNovoPrato.setBounds(54,313,342,50);
        adicionarNovoPrato.setBounds(85,607,280,60);

        getContentPane().add(inputNomeNovoPrato);
        getContentPane().add(inputPrecoNovoPrato);
        getContentPane().add(adicionarNovoPrato);

        adicionarNovoPrato.addActionListener(e ->{
            String nomeNovoPrato = inputNomeNovoPrato.getText();
            String precoNovoPratoString = inputPrecoNovoPrato.getText();

            Prato prato = new Prato(nomeNovoPrato, Double.parseDouble(precoNovoPratoString));

            Prato.cadastrarPrato(prato);
            //Prato.cadastrarPrato(new Prato(nomeNovoPrato, Double.parseDouble(precoNovoPratoString)));

            FinalizarPrato finPrato = new FinalizarPrato();
            finPrato.setVisible(true);
            System.out.println(prato);
            dispose();
        });

    }
    public static void main(String[] args) { new CadPrato(); }
}
