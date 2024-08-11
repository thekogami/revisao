import entidades.Cidade;
import entidades.Cliente;
import entidades.ClienteRecord;
import entidades.Pokemon;

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

        var pikaxu = new Pokemon("Pikaxu");
        var charmander = new Pokemon("Charmander");
        var squirtle = new Pokemon("Squirtle");
        var bulbasaur = new Pokemon("Bulbasaur");
        var jigglypuff = new Pokemon("Jigglypuff");
        var psyduck = new Pokemon("Psyduck");

        cliente.getPokemons().add(pikaxu);
        cliente.getPokemons().add(charmander);
        cliente.getPokemons().add(squirtle);
        cliente.getPokemons().add(bulbasaur);
        cliente.getPokemons().add(jigglypuff);
        cliente.getPokemons().add(psyduck);
        System.out.println(cliente.getPokemons());
    }
}
