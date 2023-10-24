import java.util.ArrayList;

public class App {

    public String user;
    public String restaurant;

    public static ArrayList<Restaurante> restaurantes = new ArrayList<>();
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Pedido> pedidos = new ArrayList<>();

    public App(){

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

    public static void cadastrarPedido (Pedido pedido) {
        pedidos.add(pedido);
        System.out.println(pedidos);
    }
    public static void main(String[] args) {
        new App();
    }
}