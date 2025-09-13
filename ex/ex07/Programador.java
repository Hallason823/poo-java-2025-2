public class Programador extends Funcionario {

    public Programador(String nome, double salario) {
        super(nome, salario);
        setRateOfIncrease(.1);
    }

    @Override
    public void aumentaSalario() {
        setSalario((1.0+getRateOfIncrease())*getSalario());
    }
}