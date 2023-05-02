public class Question4 {

}

public interface Flapping {
    public static final int DEFAULT_WING_BEATS = 30;
    public static final int DEFAULT_POPULATION = 10000;

    public int wingBeats();

    public boolean flaps();
}

public abstract class Animal {
    String species;
    int population;

    public Animal(String s, int p) {
        if (s == null || s == "")
            throw new InvalidAnimalException("Species must be given.");
        if (p < 0)
            throw new InvalidAnimalException("Population cannot be negative");
        species = s;
        population = p;

        System.out.println("New animal, species is " + species + ", population" + population);
    }
}

public abstract class FlyingAnimal extends Animal implements Flapping {
    protected int wingBeatsPerSecond;

    public FlyingAnimal(String name, int population, int w) {
        super(name, population);
        if (w < 1) throw new FlyingAnimalException("Wing beats < 1");
        else
            wingBeatsPerSecond = w;
    }

    public String toString() {
        return this.getClass().getName();
    }
}

public class Bird extends FlyingAnimal {
    private boolean flapping = true;

    public Bird(String species) {
        super(species, Flapping.DEFAULT_WING_BEATS, Flapping.DEFAULT_POPULATION);
    }

    public Bird(String species, int population, int wingBeats) {
        super(species, population, wingBeats);

        System.out.println(this.toString() + " created, Species is " +
                species + " wing beats = " + wingBeats);
    }

    public int wingBeats() {
        return wingBeatsPerSecond;
    }

    public boolean flaps() {
        return flapping;
    }
}

public class Bat extends FlyingAnimal {
    private boolean flapping = false;

    public Bat(String species) {
        super(species, Flapping.DEFAULT_WING_BEATS, Flapping.DEFAULT_POPULATION);
    }

    public Bat(String species, int population, int wingBeats) {
        super(species, population, wingBeats);

        System.out.println(this.getClass().getName() + " created, Species is " +
                species + " wing beats = " + wingBeats);
    }

    public int wingBeats() {
        return wingBeatsPerSecond;
    }

    public boolean flaps() {
        return flapping;