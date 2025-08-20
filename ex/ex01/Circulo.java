public class Circulo {
    private double raio;

    Circulo(double r) {
        raio = r;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
        else {
            System.out.println("ERROR: Invalid ray, it should be plus of zero!");
        }
    }

    public double getRaio() {
        return raio;
    }

    double comprimento() {
        return 2 * 3.14 * raio;
    }
    double area() {
        return 3.14 * raio * raio;
    }
}