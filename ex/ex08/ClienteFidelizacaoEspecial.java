public class ClienteFidelizacaoEspecial extends ClienteFidelizacao {
    
    public ClienteFidelizacaoEspecial(String nome, String endereco, InfoCliente infoCliente, double bonus, String validade) {
        super(nome, endereco, infoCliente, bonus, validade);
    }

    public ClienteFidelizacaoEspecial(String nome, String endereco, InfoCliente infoCliente, String validade) {
        super(nome, endereco, infoCliente, validade);
    }

    @Override
    public void adicionarBonus(double valorCompra) {
        setBonus(getBonus() + 0.1*valorCompra);
    }
}
