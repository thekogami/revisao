package entidades;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String endereco;
    private Cidade cidade;
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

    public ArrayList getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList pokemons) {
        this.pokemons = pokemons;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cliente() {
        System.out.println("Construtor sem parâmetros");
    }
    
    public Cliente(String nome) {
        System.out.println("Construtor com parâmetros");
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return getNome();
    }
}
