public class Quadrado implements FormaGeometrica {

    private double comprimento;

    public Quadrado(double comprimento) {
        setComprimento(comprimento);
    }

    public void setComprimento(double comprimento) {
         if (comprimento >= 0.0) {
            this.comprimento = comprimento;
        }
        else {
            System.out.println("O comprimento dever ser igual ou maior que 0.0!");
        }
    }

    public double getComprimento() {
        return comprimento;
    }

    @Override
    public double perimetro() {
        return 4*comprimento;
    }

    @Override
    public double area() {
        return comprimento*comprimento;
    }
}