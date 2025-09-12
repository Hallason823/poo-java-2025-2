import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> animals;
    private int animals_num;

    public Zoo() {
        this.animals = new ArrayList<>();
        this.animals_num = 0;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animals_num += 1;
    }

    public boolean removeAnimal(long id) {
        for (int i = 0; i < animals_num; i++) {
            if((animals.get(i)).getId() == id) {
                animals.remove(i);
                animals_num -= 1;
                return true;
            }
        }
        return false;
    }

    public ArrayList<Animal> listAnimals() {
        return animals;
    }

    public int getAnimalsNum() {return animals_num;}
}