import entidades.Cliente;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        // NullPointException é a ausencia de valor em uma variável
        System.out.println(cliente.toString());

        System.out.println("Hello, World!");
    }
}
