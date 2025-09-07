public class LocadoraEstoque {

    public static void cadastrarFilmes(Filme[] movies, Locadora video_store) {
        int amount_movies = movies.length;
        for (int i = 0; i < amount_movies; i++) {
            video_store.adicionarFilme(movies[i]);
        }
    } 
    public static void main(String[] args) {
        Filme[] movies = {new Filme("The Imitation Game", "Biography"),
                          new Filme("Interstellar", "Adventure, Drama and Sci-Fi", 2014),
                          new Filme("The Intern", "Comedy", 2015),
                          new Filme("Pitch Perfect 2", "Musical and Comedy", 2015),
                          new Filme("The Passengers", "Romance", 2016),
                          new Filme("Pride and Prejudice and Zombies", "Action, Romance and Horror", 2016),
                          new Filme("Logan", "Action, Drama and Sci-F", 2017),
                          new Filme("I Fell Pretty", "Romantic Comedy", 2018)};  
        Locadora video_store = new Locadora("Heavy Reels");
        movies[0].setAnoLancamento(2014);
        cadastrarFilmes(movies, video_store);
        video_store.listarFilmes();
    }
}