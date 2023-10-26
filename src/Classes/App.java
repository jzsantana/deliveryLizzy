package Classes;

import java.util.ArrayList;

import static Classes.Prato.pratos;

public class App {
    public String user;
    public String restaurant;
    public static ArrayList<Restaurante> restaurantes = new ArrayList<>();
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public App(){
    }

    // aqui eu crio uma funçaõ que 'popula' meus arrays
    public static void populandoLista(){
        Restaurante pizzaria = new Restaurante("Papa's Pizzaria", "112223330001", "A2","102030");
        restaurantes.add(pizzaria);

        Usuario admin = new Usuario("julia", "512", "B4", "102030");
        usuarios.add(admin);

        Prato queijoso = new Prato("Queijoso: pão com queijo derretido", 12.50);
        pratos.add(queijoso);
    }


    public App(String user, String restaurant) {
        this.user = user;
        this.restaurant = restaurant;
    }

    public static void cadastrarRestaurante(Restaurante restaurante){
        restaurantes.add(restaurante);
        System.out.println(restaurantes);
    }

    public static void cadastrarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println(usuarios);
    }

    public static void main(String[] args) {
        new App();
    }
}