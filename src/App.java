import entidades.Cidade;
import entidades.Cliente;
import entidades.ClienteRecord;

public class App {
    public static void main(String[] args) throws Exception {

        var cliRecord = new ClienteRecord("Maria", "Rua Azul");
        System.out.println(cliRecord.nome());

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        // NullPointException é a ausencia de valor em uma variável
        System.out.println(cliente.getNome());

        System.out.println("Hello, World!");

        System.out.println(cliente.toString());
        System.out.println(cliRecord);

        var joinville = new Cidade("Joinville");
        cliente.setCidade(joinville);
        System.out.println(cliente.getCidade().toString());
    }
}
