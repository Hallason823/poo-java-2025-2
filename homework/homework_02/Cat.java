import java.util.ArrayList;
import java.util.Collections;

public class Cat extends Animal {

    private static final String FIXED_NAME = "Whiskes", FIXED_SOUND = "meow", FIXED_ABILITY = "agility";

    public Cat(long id, int age, double weight) {
        super(id, FIXED_NAME, age, weight, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    public Cat(int age, double weight) {        
        super(FIXED_NAME, age, weight, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    public Cat(long id) {
        super(id, FIXED_NAME, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    public Cat() {
        super(FIXED_NAME, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    @Override
    public String sound() {
        return "The " + FIXED_NAME + " says " + FIXED_SOUND;
    }
}