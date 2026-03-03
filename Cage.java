import java.util.ArrayList;

public class Cage {

    // ===== Instance Variables =====
    private ArrayList<Animal> animals;

    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: create animals list
     * REQUIRED: add at least 1 random Animal
     */
    public Cage() {
        // TODO: instantiate animals
        this.animals = new ArrayList<Animal>();
        // TODO: add at least one new Animal() to the list
        this.animals.add(new Animal());
    }

    /**
     * Parameterized constructor:
     * REQUIRED: create animals list
     * REQUIRED: add the provided animal to the list
     */
    public Cage(Animal animal) {
        // TODO: instantiate animals
        this.animals = new ArrayList<Animal>();
        // TODO: add provided animal
        this.animals.add(animal);
        
    }

    // ===== Getters / Setters (careful!) =====
    public int getNumAnimals() {
        // TODO: return the number of animals in the cage
        return animals.size();
    }

    public Animal getAnimalAtIndex(int index) {
        // TODO: return the animal at index (or null if invalid)
        if(animals.get(index).equals("null")){
         return null;
         }
        return animals.get(index);
    }

    // ===== Behaviors =====

    /**
     * REQUIRED: add an animal;
     */
    public void addAnimal(Animal animal) {
      this.animals.add(animal);
    }

    /**
     * REQUIRED: remove an animal if it exists; return true if removed.
     */
    public boolean removeAnimal(Animal animal) {
      if(animals.contains(animal)){
         animals.remove(animal);
         return true;
         }
         return false;
    }

    @Override
    public String toString() {
        // TODO: return a friendly description including all animals
        // Example: "Cage with 3 animals: [Animal{...}, Animal{...}]"
        return "Cage with "+animals.size()+" animal(s)"+animals;
    }
}