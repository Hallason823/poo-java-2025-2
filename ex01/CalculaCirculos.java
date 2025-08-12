public class CalculaCirculos {

    public static void main(Sttring[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();

        c1.raio = 2;
        c2.raio = 3;

        System.out.println(c1.area());
        System.out.println(c2.area());
    }
}