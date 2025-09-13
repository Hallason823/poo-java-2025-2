public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
        setRateOfIncrease(.2);
    }

    @Override
    public void aumentaSalario() {
        setSalario((1.0+getRateOfIncrease())*getSalario());
    }
}
