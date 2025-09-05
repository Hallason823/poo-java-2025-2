public class CachorroAdestrado extends Cachorro {

    private boolean frescura;

    public CachorroAdestrado(String nome, String raca, boolean frescura) {
        super(nome, raca);
        setFrescura(frescura);
    }

    public void setFrescura(boolean frescura) {
        this.frescura = frescura;
    }

    public boolean getFrescura() {
        return frescura;
    }

    public void deitar() {
        status = "deitando";
    }

    public void rolar() {
        status = "rolando";
    }

    public void fingirDeMorto() {
        status ="fingindo de morto";

    }
}
