import java.util.ArrayList;

public class Locadora {

    private String nome;
    private ArrayList<Filme> filmes;

    public Locadora(String nome) {
        setNome(nome);
        filmes = new ArrayList<Filme>();
    }

    public void setNome(String nome) {
        if (!(nome.isEmpty() || nome.isBlank() || nome == null)) {
            this.nome = nome;
        }
        else {
            System.out.println("The name of the video store can't be null or void.");
        }
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public String getNome() {
        return nome;
    }

    public void listarFilmes() {
        int amount_movies = filmes.size();
        System.out.println("MOVIES FROM " + nome.toUpperCase() + ":");
        for (int i = 0; i < amount_movies; i++) {
            System.out.println(filmes.get(i).toString());
        }
    }
}