public class Restaurante {
    private String nomeRestaurante;
    private Integer cnpj;
    private Integer posicaoMapa;
    private String senhaRestaurante;

    public String getSenhaRestaurante() {
        return senhaRestaurante;
    }

    public void setSenhaRestaurante(String senhaRestaurante) {
        this.senhaRestaurante = senhaRestaurante;
    }

    public Restaurante() {

    }

    public Restaurante(String nomeRestaurante, Integer cnpj, Integer posicaoMapa, String senhaRestaurante) {
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

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getPosicaoMapa() {
        return posicaoMapa;
    }

    public void setPosicaoMapa(Integer posicaoMapa) {
        this.posicaoMapa = posicaoMapa;
    }


}