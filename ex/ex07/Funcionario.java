public abstract class Funcionario {

    private String nome;
    private double salario;
    private double rate_of_increase;

    Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty() && !nome.isBlank()) {
            this.nome = nome;
        }
        else {
            System.out.println("The name can't be null, empty or blank!");
        }
    }

    public void setSalario(double salario) {
        if (salario > 0.0) {
            this.salario = salario;
        }
        else {
            System.out.println("The salary should br greater than 0.0!");
        }
    }

    public void setRateOfIncrease(double rate_of_increase) {
        this.rate_of_increase = rate_of_increase;
    }

    public String getNome() {return nome;}

    public double getSalario() {return salario;}

    public double getRateOfIncrease() {return rate_of_increase;}

    @Override
    public String toString() {
        return "Name: " + nome + " | Salary: " + salario;
    }

    public abstract void aumentaSalario();
}