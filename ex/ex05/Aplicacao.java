public class Aplicacao {

    public static void main(String[] args) {
        Cachorro c = new Cachorro("toto", "caramelo");
        Cachorro ca = new CachorroAdestrado("floquinho", "poodle", true);
        imprime(c);
        imprime(ca);
    }

    public static void imprime(Cachorro c) {
        System.out.println("Nome: " + c.getNome());
        System.out.println("Raça: " + c.getRaca());
        System.out.println("Status: " + c.getStatus());
        if (c instanceof CachorroAdestrado) {
            System.out.println("Frescurendo: " + ((CachorroAdestrado)c).getFrescura());
        }
    }
}
