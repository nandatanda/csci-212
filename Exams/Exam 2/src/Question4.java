interface Flapping {
    public static final int DEFAULT_WING_BEATS = 30;
    public static final int DEFAULT_POPULATION = 10000;

    public int wingBeats();

    public boolean flaps();
}

abstract class Animal {
    String species;
    int population;

    public Animal(String s, int p) {
        if (s == null || s == "")
            throw new InvalidAnimalException("Species must be given.");
        if (p < 0)
            throw new InvalidAnimalException("Population cannot be negative");
        species = s;
        population = p;

        System.out.println("New animal, species is " + species + ", population " + population);
    }

    public String getSpecies() {
        return species;
    }

    public void setPopulation(int p) {
        if (p < 0)
            throw new InvalidAnimalException("Population cannot be negative");
        population = p;
    }
}

abstract class FlyingAnimal extends Animal implements Flapping {
    protected int wingBeatsPerSecond;

    public FlyingAnimal(String name, int population, int w) {
        super(name, population);
        if (w < 1) throw new InvalidAnimalException("Wing beats must be greater than zero");
        else
            wingBeatsPerSecond = w;
    }

    public String toString() {
        return this.getClass().getName();
    }
}

class InvalidAnimalException extends IllegalArgumentException {
    public InvalidAnimalException(String message) {
        super(message);
    }
}

class Bird extends FlyingAnimal {
    private boolean flapping = true;

    public Bird(String species) {
        super(species, Flapping.DEFAULT_POPULATION, Flapping.DEFAULT_WING_BEATS);
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

class Bat extends FlyingAnimal {
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
    }
}

class Main {
    public static void main(String[] args) {
        Bat igor = null;
        Bird robin;
        FlyingAnimal finch;
        igor = new Bat("Vampire", 1200, 30);
    }
}