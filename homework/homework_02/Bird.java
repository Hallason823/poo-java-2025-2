import java.util.ArrayList;
import java.util.Collections;

public class Bird extends Animal {

    private static final String FIXED_NAME = "Tweety", FIXED_SOUND = "piu", FIXED_ABILITY = "fly";

    public Bird(long id, int age, double weight) {
        super(id, FIXED_NAME, age, weight, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    public Bird(int age, double weight) {        
        super(FIXED_NAME, age, weight, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    public Bird(long id) {
        super(id, FIXED_NAME, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    public Bird() {
        super(FIXED_NAME, new ArrayList<>(Collections.singletonList(FIXED_ABILITY)));
    }

    @Override
    public String sound() {
        return "The " + FIXED_NAME + " says " + FIXED_SOUND;
    }
}