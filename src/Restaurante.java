import java.util.HashMap;
import java.util.Map;

public class Restaurante {
    private String nomeRestaurante;
    private String cnpj;
    private String posicaoMapa;
    private String senhaRestaurante;

    public String getSenhaRestaurante() {
        return senhaRestaurante;
    }

    public void setSenhaRestaurante(String senhaRestaurante) {
        this.senhaRestaurante = senhaRestaurante;
    }

    public Restaurante() {

    }

    public Restaurante(String nomeRestaurante, String cnpj, String posicaoMapa, String senhaRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpj = cnpj;
        this.posicaoMapa = posicaoMapa;
        this.senhaRestaurante = senhaRestaurante;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPosicaoMapa() {
        return posicaoMapa;
    }

    public void setPosicaoMapa(String posicaoMapa) {
        this.posicaoMapa = posicaoMapa;
    }

   private static Map<String, Restaurante> dadosRestaurante = new HashMap<>();

    public static Map<String, Restaurante> getDadosRestaurante() {
        return dadosRestaurante;
    }

    public static void setDadosRestaurante(Map<String, Restaurante> dadosRestaurante) {
        Restaurante.dadosRestaurante = dadosRestaurante;
    }

    public static void adicionarDadosRestaurante (String cnpj, Restaurante res){
        dadosRestaurante.put(cnpj,res);
    }

    public static Restaurante obterRestaurante(String cnpj){
        System.out.println(dadosRestaurante);
        return dadosRestaurante.get(cnpj);
    }



}
