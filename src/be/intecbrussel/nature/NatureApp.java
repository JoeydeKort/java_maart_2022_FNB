package be.intecbrussel.nature;

import be.intecbrussel.animals.Carnivore;
import be.intecbrussel.animals.Herbivore;
import be.intecbrussel.animals.Omnivore;
import be.intecbrussel.notebook.ForestNoteBook;
import be.intecbrussel.plants.*;

public class NatureApp {

    public static void main(String[] args) {

        Herbivore herbivore1 = new Herbivore("Gorilla", 170, 1.6, 0.5, 120, "boe");
        Herbivore herbivore2 = new Herbivore("Rabbit", 2, 0.3, 0.2, 90, "bam");
        Herbivore herbivore3 = new Herbivore("Elephant", 4000, 5.5, 2.9, 35, "tuut");

        Carnivore carnivore1 = new Carnivore("Snek", 59, 0.4, 6, 55, "woef");
        Carnivore carnivore2 = new Carnivore("Lion", 190, 1, 2.3, 10, "Miauw");
        Carnivore carnivore3 = new Carnivore("Frog", 0.22, 0.06, 0.09, 80, "kwak");

        Omnivore omnivore1 = new Omnivore("Bear", 200, 1.8, 0.6, 60, "grom");
        Omnivore omnivore2 = new Omnivore("human", 69, 1.8, 0.2, 40, "Hallo!");
        Omnivore omnivore3 = new Omnivore("Dog", 30, 0.8, 1.07, 75, "waf waf");

        Tree plant1 = new Tree("Maple", 34.5, LeafType.NEEDLE, Colour.RED);
        Bush plant2 = new Bush("George", 9.11, LeafType.SPEAR, "Berries", Colour.BLUE);
        Flower plant3 = new Flower("Sunflower", 7, Scent.SWEET, Colour.GREEN);
        Weed plant4 = new Weed("Snoop Dogg's favourite weed", 420, 20.0, Colour.YELLOW);
        Tree plant5 = new Tree("Oak", 12.3, LeafType.ROUND, Colour.BROWN);

        ForestNoteBook myForestNoteBook = new ForestNoteBook();

        myForestNoteBook.addPlant(plant1);
        myForestNoteBook.addPlant(plant2);
        myForestNoteBook.addPlant(plant3);
        myForestNoteBook.addPlant(plant4);
        myForestNoteBook.addPlant(plant5);

        myForestNoteBook.addAnimal(herbivore1);
        myForestNoteBook.addAnimal(herbivore2);
        myForestNoteBook.addAnimal(herbivore3);

        myForestNoteBook.addAnimal(carnivore1);
        myForestNoteBook.addAnimal(carnivore2);
        myForestNoteBook.addAnimal(carnivore3);

        myForestNoteBook.addAnimal(omnivore1);
        myForestNoteBook.addAnimal(omnivore2);
        myForestNoteBook.addAnimal(omnivore3);

        myForestNoteBook.printNotebook();

    }

}
