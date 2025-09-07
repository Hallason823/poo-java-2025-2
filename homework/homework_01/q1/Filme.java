public class Filme {

    private String titulo, genero;
    private int anoLancamento;

    public Filme(String titulo, String genero, int anoLancamento) {
        setTitulo(titulo);
        setGenero(genero);
        setAnoLancamento(anoLancamento);
    }

    public Filme(String titulo, String genero) {
        this(titulo, genero, 0);
    }

    public void setTitulo(String titulo) {
        if (!(titulo.isEmpty() || titulo.isBlank() || titulo == null)) {
            this.titulo = titulo;
        }
        else {
            System.out.println("The title of the movie can't be null or void.");
        }
    }

    public void setGenero(String genero) {
        if(!(genero.isEmpty() || genero.isBlank() || genero == null)) {
            this.genero = genero;
        }
        else {
            System.out.println("The genre of the movie can't be null or void.");
        }
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento >= 0) {
            this.anoLancamento = anoLancamento;
        }
        else {
            System.out.println("The year of the movie was released can't be less of zero.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    @Override
    public String toString() {
        return "[Title: " + titulo + ", Genre: " + genero + ", Year of the releasead: " + anoLancamento + "]";
    }
}