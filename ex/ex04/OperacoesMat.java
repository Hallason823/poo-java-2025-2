public class OperacoesMat {

    public static double pot(double a, int b) {
        double res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }

    public static double areaCirculo(double r) {
        return ConstantesMat.PI * pot(r, 2);
    }
}
