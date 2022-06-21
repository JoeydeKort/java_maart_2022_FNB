package be.intecbrussel.notebook;

import be.intecbrussel.animals.Animal;
import be.intecbrussel.animals.Carnivore;
import be.intecbrussel.animals.Herbivore;
import be.intecbrussel.animals.Omnivore;
import be.intecbrussel.plants.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNoteBook {

    private List<Animal> animals;
    private List<Plant> plants;
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;

    public ForestNoteBook() {
        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }

    public List<Carnivore> getCarnivores() {

        return this.carnivores;

    }

    public List<Omnivore> getOmnivores() {

        return this.omnivores;
    }

    public List<Herbivore> getHerbivores() {

        return this.herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void printNotebook() {

        System.out.println("\nTotal notebook---------------------------------\n");
        animals.stream().forEach(e -> System.out.println(("found animal: " + e.toString())));
        plants.stream().forEach(e -> System.out.println(("found plant: " + e.toString())));

        System.out.println("\nAnimal and plant count---------------------------------\n");
        System.out.println("We have " + animalCount + " animals.");
        System.out.println("We have " + plantCount + " plants.");

        System.out.println("\nCarnivores---------------------------------\n");
        getCarnivores().forEach(System.out::println);
        System.out.println("\nHerbivores---------------------------------\n");
        getHerbivores().forEach(System.out::println);
        System.out.println("\nOmnivores---------------------------------\n");
        getOmnivores().forEach(System.out::println);

        System.out.println("\nSorted by name----------------------------\n");
        sortPlantsByName();
        sortAnimalsByName();

        System.out.println("\nSorted by color--------------------------\n");
        sortPlantsByColor();

        System.out.println("Sorted by Decibel" + "-".repeat(80) + "\n");
        sortAnimalByDecibel();

        System.out.println("\nSorted by height--------------------------\n");
        sortAnimalsByHeight();
        sortPlantsByHeight();

    }

    public void addAnimal(Animal animal) {

        if (!animals.contains(animal)) {
            animals.add(animal);

            animalCount++;

            if (animal instanceof Carnivore) {
                carnivores.add((Carnivore) animal);
            } else if (animal instanceof Omnivore) {
                omnivores.add((Omnivore) animal);
            } else if (animal instanceof Herbivore) {
                herbivores.add((Herbivore) animal);
            }
        }
    }

    public void addPlant(Plant plant) {

        if (!plants.contains(plant)) {
            plants.add(plant);

            plantCount++;

        }

    }

    public void sortAnimalsByName() {

        animals.sort(Comparator.comparing(Animal::getName,
                String::compareToIgnoreCase));
        animals.stream().forEach(System.out::println);

    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName,
                String::compareToIgnoreCase));
        plants.stream().forEach(System.out::println);
    }


    public void sortPlantsByColor() {

        plants.sort(Comparator.comparingInt(plant ->
                plant.getColour().name().charAt(0)));
        plants.stream().forEach(System.out::println);

    }

    public void sortAnimalByDecibel() {

        animals.stream()
                .filter(a -> a.getDecibel() > 50)
                .sorted(Comparator.comparing(Animal::getDecibel))
                .sorted(Comparator.comparingInt(Animal::getDecibel).reversed())
                .forEach(System.out::println);
    }


    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
        plants.stream().forEach(System.out::println);
    }


    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
        animals.stream().forEach(System.out::println);

    }

}
