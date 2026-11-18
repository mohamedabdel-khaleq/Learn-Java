
package Lec5;

// Represents an animal.
class Animal {

    // Instance variables
    String name;
    String favouriteFood;

    // Static variable shared by all Animal objects
    static int numberOfAnimals = 0;

    // Constructor
    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;

        numberOfAnimals++;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Creating objects using the constructor
        Animal animal1 = new Animal("Lion", "Meat");
        Animal animal2 = new Animal("Rabbit", "Carrots");
        Animal animal3 = new Animal("Monkey", "Bananas");

        // Displaying object information
        System.out.println("Animal 1: " + animal1.name);
        System.out.println("Favourite Food: " + animal1.favouriteFood);

        System.out.println("--------------------");

        System.out.println("Animal 2: " + animal2.name);
        System.out.println("Favourite Food: " + animal2.favouriteFood);

        System.out.println("--------------------");

        System.out.println("Animal 3: " + animal3.name);
        System.out.println("Favourite Food: " + animal3.favouriteFood);

        System.out.println("--------------------");

        // Displaying the total number of animals
        System.out.println("Total Animals: " + Animal.numberOfAnimals);
    }
}