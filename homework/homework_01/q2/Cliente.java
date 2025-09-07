public class Cliente {
    
    private String nome, cpf;
    private int saldo, numConta;

    public Cliente(String nome, String cpf, int saldo, int numConta) {
        setNome(nome);
        setCpf(cpf);
        setSaldo(saldo);
        setNumConta(numConta);
    }

    public Cliente(String nome, String cpf, int numConta) {
        this(nome, cpf, 0, numConta);
    }

    public void setNome(String nome) {
        if(!(nome.isEmpty() || nome.isBlank() || nome == null)) {
            this.nome = nome;
        }
        else {
            System.out.println("The name can't be null or void.");
        }
    }

    public void setCpf(String cpf) {
        if (!(cpf.isEmpty() || cpf.isBlank() || cpf == null)) {
            this.cpf = cpf;
        }
        else {
            System.out.println("The CPF can't be null or void.");
        }
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNumConta(int numConta) {
        if (numConta >= 0) {
            this.numConta = numConta;
        }
        else {
            System.out.println("The number of the account can't be negative.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public int extrato() {
        return getSaldo();
    }

    public void saque(int val) {
        saldo -= val;
    }

    public void deposito(int val) {
        saldo += val;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\nCPF: " + cpf +"\nConta: " + numConta + "\nSaldo: " + saldo;
    }
}