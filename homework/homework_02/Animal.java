import java.util.ArrayList;

public class Animal {

    private long id;
    private String name;
    private int age;
    private double weight;
    private ArrayList<String> abilities;
    private int abilities_num;
    private static long count = 0;

    public Animal(long id, String name, int age, double weight, ArrayList<String> abilities) {
        setId(id);
        setName(name);
        setAge(age);
        setWeight(weight);
        setAbilities(abilities);
    }

    public Animal(String name, int age, double weight, ArrayList<String> abilities) {
        this(Animal.count, name, age, weight, abilities);
        Animal.count += 1;
    }

    public Animal(long id, String name, ArrayList<String> abilities) {
        setId(id);
        setName(name);
        setAbilities(abilities);
    }

    public Animal(String name, ArrayList<String> abilities) {
        this(Animal.count, name, abilities);
        Animal.count += 1;
    }

    public void setId(long id) {
        if (id >= 0) {
            this.id = id;
        }
        else {
            System.out.println("The id should be greater than or equals to 0.");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
        else {
            System.out.println("The name can't be null, empty or blank!");
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else {
            System.out.println("The age should be greater than or equals to 0.");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        }
        else {
            System.out.println("The weight should be greater than 0.0.");
        }
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
        this.abilities_num = this.abilities.size();
    }

    public long getId() {return id;}

    public String getName() {return name;}

    public int getAge() {return age;}

    public double getWeight() {return weight;}

    public ArrayList<String> getAbilities() {return abilities;}
    
    public int getAbilitiesNum() {return abilities_num;}

    public String convertAbilitiesToString() {
        String abilities_str = "";
        for (int i = 0; i < abilities_num-1; i++) {
            abilities_str += abilities.get(i).toLowerCase() + " | ";
        }
        if(abilities_num >= 1) {abilities_str += abilities.get(abilities_num-1).toLowerCase();}
        return abilities_str;
    }

    @Override
    public String toString() {
        return "Animal ID " + id + ": " + name + "\nAge: " + age + "\nWeight: " + weight + "\nAbilities: " + convertAbilitiesToString();
    }

    public String sound() {
        return "The animal makes sound";
    }

    public String performAbility(String ability) {
        for (int i = 0; i < abilities_num; i++) {
            if (abilities.get(i).compareToIgnoreCase(ability) == 0) {
                return name + " can " + ability.toLowerCase();
            }
        }
        return name + " can't " + ability.toLowerCase();
    }
}