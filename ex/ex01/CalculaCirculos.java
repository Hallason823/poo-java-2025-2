public class CalculaCirculos {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(3);

        System.out.println(c1.area());
        System.out.println(c2.area());

        System.out.println("Raio: " + c1.getRaio());
        System.out.println(c1.area());

        c1.setRaio(3);
        System.out.println("Raio: " + c1.getRaio());
        System.out.println(c1.area());

        c1.setRaio(-1);
    }
}