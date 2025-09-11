public class Gerenciador {

    public static void checarTipoDeAnimal(Animal animal) {
        if (animal instanceof Cachorro) {
            System.out.println("O animal é do tipo CACHORRO.");
        }
        else if (animal instanceof Gato) {
            System.out.println("O animal é do tipo GATO.");
        }
        else {
            System.out.println("O animal é generico.");
        }
    }

    public static void rodarMetodoEspecificoAnimal(Animal animal) {
        if (animal instanceof Cachorro) {
            ((Cachorro)animal).abanarRabo();
        }
        else if (animal instanceof Gato) {
           ((Gato)animal).arranharMoveis();
        }
    }

    public static void interagirComAnimais(Animal[] animais) {
        int quantidade_animais = animais.length;
        for (int i = 0; i < quantidade_animais; i++) {
            System.out.println("INDEX " + i + " :");
            animais[i].fazerSom();
            checarTipoDeAnimal(animais[i]);
            rodarMetodoEspecificoAnimal(animais[i]);
        }
    }

    public static void main(String[] args) {
        Animal[] animais = {new Cachorro(), new Gato(), new Cachorro(), new Gato()};
        interagirComAnimais(animais);
    }
}