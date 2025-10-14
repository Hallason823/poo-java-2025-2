public class Circulo implements FormaGeometrica, Impressao {

    private static final double PI = 3.1415;
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public void setRaio(double raio) {
        if (raio >= 0.0) {
            this.raio = raio;
        }
        else {
            System.out.println("O raio dever ser igual ou maior que 0.0!");
        }
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double perimetro() {
        return 2*PI*raio;
    }

    @Override
    public double area() {
        return PI*raio*raio;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Circulo de raio: " + raio + ", area: " + area() + " e perimetro: " + perimetro());
    } 
}