public class Gerenciador {

    public static void main(String[] args) {
        Banco bank = new Banco();
        bank.cadastrarClientes();
        System.out.println(bank.operacoes());
    }
}
