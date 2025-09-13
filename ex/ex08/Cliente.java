public class Cliente {

    private String nome;
    private String endereco;
    private InfoCliente infoCliente;

    public Cliente(String nome, String endereco, InfoCliente infoCliente) {
        setNome(nome);
        setEndereco(endereco);
        setInfoCliente(infoCliente);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty() && !nome.isBlank()) {
            this.nome = nome;
        }
        else {
            System.out.println("O NOME NÃO PODE SER: NULL || EMPTY || BLANK.");
        }
    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.isEmpty() && !endereco.isBlank()) {
            this.endereco = endereco;
        }
        else {
            System.out.println("O ENDEREÇO NÃO PODE SER: NULL || EMPTY || BLANK.");
        }
    }

    public void setInfoCliente(InfoCliente infoCliente) {
        this.infoCliente = infoCliente;
    }

    public String getNome() {return nome;}

    public String getEndereco() {return endereco;}

    public InfoCliente getInfoCliente() {return infoCliente;}
}