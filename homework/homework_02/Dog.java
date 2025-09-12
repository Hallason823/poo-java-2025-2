import java.util.ArrayList;
import java.util.Collections;

public class Dog extends Animal {

    private static final String FIXED_NAME = "Buddy", FIXED_SOUND = "au", FIXED_ABILITY = "sniff";

    public Dog(long id, int age, double weight) {
        super(id, FIXED_NAME, age, weight, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    public Dog(int age, double weight) {        
        super(FIXED_NAME, age, weight, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    public Dog(long id) {
        super(id, FIXED_NAME, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    public Dog() {
        super(FIXED_NAME, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    @Override
    public String sound() {
        return "The " + FIXED_NAME + " says " + FIXED_SOUND;
    }
}