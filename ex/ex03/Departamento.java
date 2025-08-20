public class Departamento {

    private int codigo;
    private String nome;

    public Departamento(int codigo, String nome) {
        setCodigo(codigo);  
        setNome(nome);  
    }

    public void setCodigo(int codigo) {
        if (codigo >= 0) {
            this.codigo = codigo;
        }
        else {
            System.out.println("The codigo should be great or equals to 0.");
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

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Departamento: [Código: " + codigo + ", Nome: " + nome + "]";
    }
}