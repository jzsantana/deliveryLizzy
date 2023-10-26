package Classes;

import java.util.ArrayList;

public class Prato {
    private String nomePrato;
    private Double precoPrato;
    public static ArrayList<Prato> pratos = new ArrayList<>();

    public Prato(){

    }

    public String getNomePrato() {
        return nomePrato;
    }

    public Double getPrecoPrato() {
        return precoPrato;
    }

    public Prato(String nomePrato, Double precoPrato) {
        this.nomePrato = nomePrato;
        this.precoPrato = precoPrato;
    }

    public static void cadastrarPrato(Prato prato){
        pratos.add(prato);
        System.out.println(pratos);
    }

    @Override
    public String toString() {
        return nomePrato + " " + precoPrato;
    }
}
