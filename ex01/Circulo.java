public class Circulo {
    double raio;

    Circulo() {
        raio = 2;
    }

    double comprimento() {
        return 2 * 3.14 * raio;
    }
    double area() {
        return 3.14 * raio * raio;
    }
}