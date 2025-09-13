public class InfoClientePessoaJuridica extends InfoCliente {
    
    private String cnpj;

    public InfoClientePessoaJuridica(String cnpj) {
        setCnpj(cnpj);
    }

    public void setCnpj(String cnpj) {
         if (cnpj != null && !cnpj.isEmpty() && !cnpj.isBlank()) {
            this.cnpj = cnpj;
        }
        else {
            System.out.println("O CNPJ NÃO PODE SER: NULL || EMPTY || BLANK.");
        }
    }

    public String getCnpj() {return cnpj;}
}