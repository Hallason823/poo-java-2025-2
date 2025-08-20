public class Funcionario {

    private int matricula;
    private String nome;
    private Departamento depto;

    public Funcionario(int matricula, String nome, Departamento depto) {
        setMatricula(matricula);
        setNome(nome);
        setDepto(depto);
    }

    public void setMatricula(int matricula) {
        if (matricula >= 0) {
            this.matricula = matricula;
        }
        else {
            System.out.println("The registration should be great or equals to 0.");
        }
    }

    public void setNome(String nome) {
        if (!(nome.isEmpty() || nome.isBlank() || nome == null)) {
            this.nome = nome;
        }
        else {
            System.out.println("The name can't be null or void");
        }
    }

    public void setDepto(Departamento depto) {
        if (depto != null) {
            this.depto = depto;
        }
        else {
            System.out.println("The department can't be null.");
        }
    }

    @Override
    public String toString() {
        return "Funcionário: [Mátricula: " + matricula + ", Nome: " + nome + ", " + depto.toString() + "]";
    }
}