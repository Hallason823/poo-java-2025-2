import java.util.Scanner;

public class Main {

    private static Zoo zoo = new Zoo();

    public static Scanner input = new Scanner((System.in));

    public static int selectTypeAnimal() {
        int type_animal;
        String[] messages = {"\nSelect a type of animal: (1) Cat; (2) Dog; (3) Bird.\n", "\nInvalid option!\n"} ;
        System.out.println(messages[0]);
        type_animal = input.nextInt();
        input.nextLine();
        while(type_animal < 1 || type_animal > 3) {
            System.out.println(messages[1] + messages[0]);
            type_animal = input.nextInt();
            input.nextLine();
        }
        return type_animal;
    }

    public static Animal createAnimalByType(int type_animal) {
        Animal animal = new Cat(0);
        switch(type_animal) {
            case 1:
                animal = new Cat();
                break;
            case 2:
                animal = new Dog();
                break;
            case 3: 
                animal = new Bird();
                break;
            default:
                break;
        }
        return animal;
    }

    public static void readAnimalStats(Animal animal) {
        System.out.println("\nType the age of the animal: ");
        animal.setAge(input.nextInt());
        System.out.println("\nType the weight of the animal: ");
        animal.setWeight(input.nextDouble());
        input.nextLine();
    }

    public static Animal readAnimal() {
        int type_animal = selectTypeAnimal();
        Animal animal = createAnimalByType(type_animal);
        readAnimalStats(animal);
        return animal;
    }

    public static void listAnimals() {
        int animals_num = zoo.getAnimalsNum();
        if (animals_num == 0) {
            System.out.println("\nTHE LIST OF ANIMALS IS EMPTY!");
        }
        for (int i = 0; i < animals_num; i++) {
            System.out.println("\n" + ((zoo.listAnimals()).get(i)).toString());
        }
    }

    public static long askForId() {
        long id;
        System.out.println("\nType the ID of the animal: ");
        id = input.nextLong();
        input.nextLine();
        return id;
    }

    public static String askForAbility() {
        String ability;
        System.out.println("\nType the ability: ");
        ability = input.nextLine();
        return ability;
    }

    public static void removeAnimal() {
        long id = askForId();
        boolean remove_id = zoo.removeAnimal(id);
        String result_message = remove_id ? "\nAnimal removed successfully!" : "\nWARN: THERE IS NO ANIMAL WITH THIS ID " + id + "!";
        System.out.println(result_message);
    }

    public static long binarySearchById(long id) {
        int start = 0, mid, end = zoo.getAnimalsNum()-1;
        while (start <= end) {
            mid = (start+end)/2;
            if (((zoo.listAnimals()).get(mid)).getId() == id) {
                return mid;
            }
            else if (((zoo.listAnimals()).get(mid)).getId() < id) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void emitAnimalSound() {
        long id = askForId();
        long idx = binarySearchById(id);
        String result_message = idx != -1 ? "\n" + (zoo.listAnimals()).get((int) idx).sound() : "\nWARN: THE ID OF THE ANIMAL DOESN'T EXIST!";
        System.out.println(result_message);
    }

    public static void testAnimalAbility() {
        long id = askForId();
        String ability = askForAbility();
        long idx = binarySearchById(id);
        String result_message = idx != -1 ? "\n" + (zoo.listAnimals()).get((int) idx).performAbility(ability) : "\nWARN: THE ID OF THE ANIMAL DOESN'T EXIST!";
        System.out.println(result_message);
    }

    public static void runUserOption(int user_answer) {
        switch (user_answer) {
            case 1:
                zoo.addAnimal(readAnimal());
                break;
            case 2:
                listAnimals();
                break;
            case 3:
                removeAnimal();
                break;
            case 4:
                emitAnimalSound();
                break;
            case 5:
                testAnimalAbility();
                break;
            case 6:
                System.out.println("\nExiting the program. Good bye!");
                break;
            default:
                System.out.println("\nInvalid option!");
        }
    }

    public static void interactWithUser() {
        int user_answer;
        do {
            System.out.println("\nSelect an option: \n(1) Add an animal;\n(2) List all animals;\n(3) Remove animal (by ID);" +
                               "\n(4) Emit animal sound (by ID);\n(5) Test animal ability (by ID);\n(6) Exit the program.\n");
            user_answer = input.nextInt();
            input.nextLine();
            runUserOption(user_answer);

        } while (user_answer != 6);
    }

    public static void main(String[] args) {
        interactWithUser();
    }
}