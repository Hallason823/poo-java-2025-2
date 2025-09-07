public class Banco {

    private static final int NUM_CLIENTES = 2;
    private Cliente[] clientes = new Cliente[NUM_CLIENTES];

    public Cliente[] getClientes() {
        return clientes;
    }

    public Cliente[] cadastrarClientes() {
        Cliente c1 = new Cliente("Alan Turing", "1289", 1500, 25896);
        Cliente c2 = new Cliente("Ada Love", "98765431", 12345);
        clientes[0] = c1;
        clientes[1] = c2;
        return clientes;
    }

    public String operacoes() {
        int saque = 100, deposito = 50, min = 0;
        String novo_nome_c2 = "Ada Lovelace", novo_cpf_c1 = "12345689";
        for (int i = 0; i < NUM_CLIENTES; i++) {
            clientes[i].saque(saque);
            clientes[i].deposito(deposito);
            if (clientes[i].extrato() < min) {
                clientes[i].setSaldo(min);
            }
        }
        clientes[1].setNome(novo_nome_c2);
        clientes[0].setCpf(novo_cpf_c1);
        return clientes[0].toString() + "\n" + clientes[1].toString();
    }
}