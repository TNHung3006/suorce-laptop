import java.util.Random;
public class TryPolymorphism {
  public static void main(String[] args) {
    // Create an array of three different animals
    Animal[] theAnimals = {
                            new Dog("Rover", "Poodle"),
                            new Cat("Max", "Abyssinian"),
                            new Duck("Daffy","Aylesbury")
                          };
    Animal petChoice;                           // Choice of pet
    Random select = new Random();               // Random number generator
    // Make five random choices of pet
    for(int i = 0; i < 5; i++) {
      // Choose a random animal as a pet
      petChoice = theAnimals[select.nextInt(theAnimals.length)]; 

      System.out.println("\nYour choice:\n" + petChoice);
      petChoice.sound();                        // Get the pet's reaction
    }
  }
}

