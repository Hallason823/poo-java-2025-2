public class InfoClientePessoaFisica extends InfoCliente {

    private String cpf;

    public InfoClientePessoaFisica(String cpf) {
        setCpf(cpf);
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.isEmpty() && !cpf.isBlank()) {
            this.cpf = cpf;
        }
        else {
            System.out.println("O CPF NÃO PODE SER: NULL || EMPTY || BLANK.");
        }
    }

    public String getCpf() {return cpf;}
}