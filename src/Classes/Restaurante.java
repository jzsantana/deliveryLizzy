package Classes;

import Classes.Prato;

import java.util.ArrayList;

public class Restaurante {
    private String nomeRestaurante;
    private String cnpj;
    private String posicaoMapa;
    private String senhaRestaurante;
    public static ArrayList<Prato> pedidos = new ArrayList<>();

    // função para armazenar os pedidos
    public static void cadastrarPedido (Prato prato) {
        pedidos.add(prato);
        System.out.println(pedidos);
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
    public String getSenhaRestaurante() {
        return senhaRestaurante;
    }
    public void setSenhaRestaurante(String senhaRestaurante) {
        this.senhaRestaurante = senhaRestaurante;
    }

    @Override
    public String toString(){
        return nomeRestaurante;    }
}
