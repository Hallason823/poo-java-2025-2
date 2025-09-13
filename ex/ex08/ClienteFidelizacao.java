public class ClienteFidelizacao extends Cliente {

    private double bonus;
    private String validade;

    public ClienteFidelizacao(String nome, String endereco, InfoCliente infoCliente, double bonus, String validade) {
        super(nome, endereco, infoCliente);
        setBonus(bonus);
        setValidade(validade);
    }

    public ClienteFidelizacao(String nome, String endereco, InfoCliente infoCliente, String validade) {
        this(nome, endereco, infoCliente, 0, validade);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getBonus() {return bonus;}

    public String getvalidade() {return validade;}

    public void adicionarBonus(double valorCompra) {
        bonus += 0.05*valorCompra;
    }
}