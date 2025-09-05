public class Cachorro {

    private String nome;
    private String raca;
    public String status;

    public Cachorro(String nome, String raca) {
        setNome(nome);
        setRaca(raca);
        this.status = "";
    }

    public void setNome(String nome) {
       if (!(nome.isEmpty() || nome.isBlank() || nome == null)) {
            this.nome = nome;
        }
        else {
            System.out.println("The name can't be null or void");
        }
    }

    public void setRaca(String raca) {
         if (!(raca.isEmpty() || raca.isBlank() || raca == null)) {
            this.raca = raca;
        }
        else {
            System.out.println("The name can't be null or void");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getStatus() {
        return status;
    }

    public void latir() {
        status = "latindo";
    }

    public void dormir() {
        status = "dormindo";
    }

    public void comer() {
        status = "comendo";
    }
}