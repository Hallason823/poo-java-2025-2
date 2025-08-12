public class CalcularRetangulo {
    public static void main (String[] args) {
        Retangulo r1 = new Retangulo(2, 5);
        Retangulo r2 = new Retangulo(3, 10);

        System.out.println("Area 1: " + r1.calcularArea());
        System.out.println("Area 2: " + r2.calcularArea());
    }
    
}